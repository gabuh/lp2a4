package entity;

import java.time.LocalDateTime;
import java.util.Scanner;
import Util.Util;

public class Event extends Reminder {
    private String description;
    private LocalDateTime endDate;
    
    protected Event(String title, LocalDateTime date, String description, LocalDateTime endDate) {
        super(title, date);
        this.description = description;
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public void showDetails() {
        System.out.println("Title: " + super.getTitle()
        + "\n Date: " + (super.getDate() != null?super.getDate().toString():"none")
        + "\n End Date: " + (endDate != null?endDate.toString():"none")
        + "\n Description: "+  description
        ); 
    }

    @Override
    public void complete(Scanner input) {
        System.out.println("Set a description: ");
        this.description = input.nextLine();    
        System.out.println("Data do termino do evento: ");
        endDate = Util.createDate();
        super.complete(input);
    }

    
}
