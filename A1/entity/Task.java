package entity;

import java.time.LocalDateTime;

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

    
}
