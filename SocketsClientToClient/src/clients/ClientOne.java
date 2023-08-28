package clients;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientOne {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            String op = "";
            Socket client = new Socket("localhost", 8080);
            PrintStream saida = new PrintStream(client.getOutputStream());
            String options[] = {"type a message"};
            ClientOneThread clientThread = new ClientOneThread(client);
            clientThread.start();
            while (!op.equals("exit")) {
                for (int i = 0; i < options.length; i++) {
                    System.out.println("[" + (i + 1) + "] > " + options[i]);
                }
                System.out.printf("pick an option typing its number, or\nyou can type 'exit' to quit.\n>>: ");

                op = input.nextLine();

                switch (op) {
                    case "1": {
                        System.out.println("Write the message: ");
                        saida.println(input.nextLine());
                        break;
                    }
                    case "exit": {
                        System.out.println("quiting....");
                        break;
                    }
                    default: {
                        System.out.println("invalid option");
                        break;
                    }
                }


            }

        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }

}
