package businessLogic;
import java.net.*;
import java.io.*;
import java.util.*;

public class Server
{

    private Socket          socket   = null;
    private ServerSocket    server   = null;
    private DataInputStream in       =  null;
    private DataOutputStream out = null;

    private BusinessLogic.calLogic calc;

    private String line = "";
    private char[] tokens;
    private Stack<Integer> val = new Stack<Integer>();
    Stack<Character> ops = new Stack<Character>();

    public Server(int port)
    {

        try
        {
            server = new ServerSocket(port);
            System.out.println("Server started");

            System.out.println("Waiting for a client ...");

            socket = server.accept();
            System.out.println("Client accepted");


            in = new DataInputStream(
                    new BufferedInputStream(socket.getInputStream()));

            out = new DataOutputStream(socket.getOutputStream());

            calc = new BusinessLogic.calLogic();

            while (true)
            {
                try
                {
                    line = in.readUTF();
                    System.out.println(line);
                    if(line.equals("Over") || line.equals("over"))
                        break;
                    int result = calc.cal(line);
                    System.out.println(result);
                    out.writeUTF(Integer.toString(result));

                }
                catch(IOException i)
                {
                    System.out.println(i);
                }
            }
            System.out.println("Closing connection");


            socket.close();
            in.close();
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }

    public static void main(String args[])
    {
        Server server = new Server(5000);
    }
}