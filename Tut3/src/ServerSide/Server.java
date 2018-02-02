package ServerSide;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;
import java.util.Map;
import BusinessLogic.*;

/**
 * Created by Amay on 2/1/2018.
 */
public class Server implements Runnable{
    private Socket connectionSocket;
    private DataInputStream in;
    private DataOutputStream out;
    public BasicCal calc;
    private Map<String, String> res;
    private String line = "";

    public Server(Socket s)throws IOException {
        System.out.println(" New Client Connected: " + s);
        connectionSocket = s;
    }

    public void run(){
        try{
            in = new DataInputStream(connectionSocket.getInputStream());
            out = new DataOutputStream(connectionSocket.getOutputStream());
            calc = new BasicCal();
            res = new Hashtable<String, String>();
            while(true){
                try{
                    line = in.readUTF();
                    System.out.println("From Client " + connectionSocket.getPort() + ":\n" + line);
                    if(line.equals("Over") || line.equals("over")) {
                        for(Map.Entry<String, String> e: res.entrySet())
                            out.writeUTF(e.getKey()+" : "+e.getValue());
                        break;
                    }
                    int result = calc.cal(line);
                    System.out.println(result);
                    res.put(line, Integer.toString(result));
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }
            System.out.println("Closing connection");


            connectionSocket.close();
            in.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    public static void main(String args[]) throws IOException {
        System.out.println("Server started");
        ServerSocket socket  = new ServerSocket(3000);

        while(true){
            Socket sock = socket.accept();
            Server server = new Server(sock);

            Thread tServer = new Thread(server);
            tServer.start();
        }
    }
}
