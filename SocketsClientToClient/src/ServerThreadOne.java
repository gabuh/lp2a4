
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerThreadOne extends Thread{
    private Socket clientOne;
    private Socket clientTwo;

    public ServerThreadOne(Socket clientOne, Socket clientTwo) {
        this.clientOne = clientOne;
        this.clientTwo = clientTwo;
    }

    @Override
    public void run() {
        try{

            InputStreamReader inputStreamReader = new InputStreamReader(clientOne.getInputStream());
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String newLine;
            PrintStream clientOneOutput = new PrintStream(clientTwo.getOutputStream());
            while ((newLine = reader.readLine()) != null){
                clientOneOutput.println(newLine);
            }


        }catch (IOException e){
            System.out.printf(e.getMessage());
        }
    }




}
