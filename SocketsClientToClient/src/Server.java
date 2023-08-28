import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {


        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server Activated, listening to port 8080 !");
            System.out.println("Waiting Client 1 connection;\n connecting...");
            Socket client1 = serverSocket.accept();
            System.out.println("Waiting Client 2 connection;\n connecting...");
            Socket client2 = serverSocket.accept();

             new ServerThreadOne(client1,client2).start();
             new ServerThreadTwo(client1,client2).start();



        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
