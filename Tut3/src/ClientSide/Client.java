package ClientSide;
import java.net.*;
import java.io.*;
import java.util.*;

public class Client {

    private Socket sock;
    private DataInputStream in;
    private DataOutputStream out;
    private Scanner sc;
    public Client(String addr, int port) throws IOException {
        sock = new Socket(addr, port);
        in = new DataInputStream(sock.getInputStream());
        out = new DataOutputStream(sock.getOutputStream());
        sc = new Scanner(System.in);

        String line = "";
        String ch = "";
        int i = 0;
        while(true){
            try{
                System.out.println("Enter Expression:");
                line = sc.nextLine();
                out.writeUTF(line);
                i++;
                System.out.println("Continue (Y/N):");
                ch = sc.nextLine();
                if(ch.equals("N") || ch.equals("n")) {
                    out.writeUTF("Over");
                    while (i > 0) {
                        System.out.println(in.readUTF());
                        i--;
                    }
                    break;
                }
            }
            catch(IOException e){
                System.out.println(e);
            }
        }
        try{
            in.close();
            out.close();
            sock.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    public static void main(String args[]) throws IOException {
        Client cl = new Client("127.0.0.1", 3000);
    }
}
