package entity;

import java.time.LocalDateTime;

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

    
}
