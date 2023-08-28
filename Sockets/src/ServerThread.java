import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerThread extends Thread{


    private Socket client;

    public ServerThread(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try{

            InputStreamReader inputStreamReader = new InputStreamReader(client.getInputStream());
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String newLine;

            while ((newLine = reader.readLine()) != null){
                System.out.println("\n Client Message: " + newLine +"\n>>: ");
            }


        }catch (IOException e){
            System.out.printf(e.getMessage());
        }
    }
}
