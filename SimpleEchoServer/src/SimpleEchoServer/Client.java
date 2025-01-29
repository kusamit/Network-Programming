package SimpleEchoServer;

import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("127.0.0.1", 5344);
            DataOutputStream d = new DataOutputStream(socket.getOutputStream());
            d.writeUTF("Hello from client");
            d.flush();
            d.close();
            socket.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}