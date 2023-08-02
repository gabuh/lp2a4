package entity;

import java.time.LocalDateTime;

public class Reminder implements Item{

    private String title;
    private LocalDateTime date;

    protected Reminder(String title, LocalDateTime date) {
        this.title = title;
        this.date = date;
    }


    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    
    @Override
    public String toString() {
        return "Item [title=" + title + ", date=" + date + "]";
    }


    public void showDetails() {
        System.out.println("Title: " + title
        + "\n Date: " + date.toString()
        );        
    }

    
}
