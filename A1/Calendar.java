import java.util.ArrayList;

import entity.Item;

public class Calendar{

    final private static ArrayList<Item> items = new ArrayList<Item>();


    public ArrayList<Item> getItems() {
        return items;
    }

    public static void addItem(Item... item){
        for (Item i : item) {
            items.add(i);
        }
    }

    public static void listItemsDetails(){
        for (Item i : items) {
            i.showDetails();
        }
    }




}