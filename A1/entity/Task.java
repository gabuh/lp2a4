package entity;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Task extends Reminder {

    private boolean status;
    private String description;

    protected Task(String title, LocalDateTime date, String description) {
        super(title, date);
        this.status = false;
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void showDetails() {
        System.out.println("Title: " + super.getTitle()
        + "\n Date: " + (super.getDate() != null?super.getDate().toString():"null")
        + "\n Status: " + (status?"Done":"Undone")
        + "\n Description: "+  description
        ); 
    }

    @Override
    public void complete(Scanner input) {
        System.out.println("Set a description: ");
        this.description = input.nextLine();    
        super.complete(input);
    }

    

    
}
