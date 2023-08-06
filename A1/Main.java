
import app.Calendar;
import entity.*;

public class Main {
    public static void main(String[] args) {
        String[] options = {"List Calendar", "Create a Reminder", "Create an Event", "Create a Task" };

        String option = "";
        while (!option.equalsIgnoreCase("exit") && !option.equals("0")) {
            for (int i=0; i<options.length; i++){
                System.out.println("["+(i+1)+"] " + options[i]);
            }
            System.out.println("Select one option typing the number or type 0 or exit to quit > ");
            
            option = Calendar.input.nextLine();

            switch (option){
                case "1" -> Calendar.listItems();
                case "2" -> Calendar.createItem(new ReminderBuilder()); 
                case "3" -> Calendar.createItem(new EventBuilder()); 
                case "4" -> Calendar.createItem(new TaskBuilder()); 
                case "0" -> System.out.println("\n\nQuiting....");
                default -> System.out.println("Something is wrong, " + option + " Invalid option");
            }


        }

        Calendar.input.close();
    }
    
}
