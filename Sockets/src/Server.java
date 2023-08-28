import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            Socket server = serverSocket.accept();
            System.out.println("Server Activated, listening to port 8080 !");
            System.out.println("Waiting Client connection;\n connecting...");
            ServerThread serverThread = new ServerThread(server);
            serverThread.start();
            String op = "";


            PrintStream saida = new PrintStream(server.getOutputStream());
            String options[] = {"type a message"};
            while (!op.equals("exit"))   {
                for (int i = 0; i< options.length ; i++){
                    System.out.println("["+(i+1)+"] > "+options[i]);
                }
                System.out.printf("pick an option typing its number, or\nyou can type 'exit' to quit.\n>>: ");

                op = input.nextLine();

                switch (op){
                    case "1":{
                        System.out.println("Write the message: ");
                        saida.println(input.nextLine());
                        break;
                    }
                    case "exit" : {
                        System.out.println("quiting....");
                        break;
                    }
                    default:
                    {
                        System.out.println("invalid option");
                        break;
                    }
                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}