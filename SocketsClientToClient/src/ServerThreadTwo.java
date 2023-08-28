import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerThreadTwo extends Thread{

    private Socket clientOne;

    private Socket clientTwo;

    public ServerThreadTwo(Socket clientOne, Socket clienteTwo) {
        this.clientOne = clientOne;
        this.clientTwo = clienteTwo;
    }

    @Override
    public void run() {
        try{

            InputStreamReader inputStreamReader = new InputStreamReader(clientTwo.getInputStream());
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String newLine;
            PrintStream clientOneOutput = new PrintStream(clientOne.getOutputStream());
            while ((newLine = reader.readLine()) != null){
                clientOneOutput.println(newLine);
            }


        }catch (IOException e){
            System.out.printf(e.getMessage());
        }
    }

}
