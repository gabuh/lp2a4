import java.util.Scanner;

import entity.*;

public class Main {
    public static void main(String[] args) {
        String[] options = {"List Calendar"};

        String option = "";
        while (!option.equalsIgnoreCase("exit") || !option.equals("0")) {
            for (int i=0; i<=options.length; i++){
                System.out.println("["+i+"] " + options[i]);
            }

        }


    }
    
}
