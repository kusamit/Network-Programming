package SimpleEchoServer;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleEchoServer {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(5344)){
            System.out.println("Waiting for connection...");
            //establish connection
            Socket clientSocket = serverSocket.accept();
            System.out.println(">> Connection established to client...");
            DataInputStream d = new DataInputStream(clientSocket.getInputStream());
            String str = (String) d.readUTF();
            System.out.println("Message from client: " + str);
            serverSocket.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
   
}
