package app;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import Util.Util;
import entity.Item;
import entity.builder.ItemBuilder;

public class Calendar{

    final private static ArrayList<Item> items = new ArrayList<Item>();
    final public static Scanner input = new Scanner(System.in);


    public ArrayList<Item> getItems() {
        return items;
    }


    public static void addItem(Item... item){
        for (Item i: item) {
            items.add(i);
            for(int j=0; j<items.size(); j++){
                if(!i.getDate().isAfter(items.get(j).getDate()))
                    items.add(j, i);
            }
        }
    }

    public static void listItems(){
        for(int i=0; i<items.size(); i++){
            System.out.println("["+(i+1)+"] >"+items.get(i).getTitle()+" Date:"+items.get(i).getDate());
        }
        var op = "";
        while(!op.equals("0")){
            System.out.println("(Type 0 to quit) Please, chose an item to see details: ");
            op = Calendar.input.nextLine();
            try {
                var itemIndex = Integer.parseInt(op);
                if (itemIndex > 0 && itemIndex <= items.size()){
                    items.get(itemIndex-1).showDetails();
                } 
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void listItemsDetails(){
        for (Item i : items) {
            i.showDetails();
        }
    }


    public static void createItem(ItemBuilder itemBuilder){
            while(true){

                try {
                    System.out.println("Title: ");
                    var title = Calendar.input.nextLine();
                    var dateInput = Util.createDate();
                    if(dateInput.isBefore(LocalDateTime.now())){
                        System.out.println("The date is invalid, must be after "+ LocalDateTime.now());
                        continue;
                    }
                    var reminder = itemBuilder.setDate(dateInput).setTitle(title).create();
                    reminder.complete(Calendar.input);            
                    items.add(reminder);
                    break;
                } catch (DateTimeException e) {
                    System.out.println(e.getMessage());
                }
            
            }
            
        }    
        

}




