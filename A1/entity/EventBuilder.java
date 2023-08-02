package entity;

import java.time.LocalDateTime;

import entity.builder.ReminderBuilder;

public class EventBuilder implements ReminderBuilder {
    private String title;
    private LocalDateTime endDate;
    private LocalDateTime date;
    private String description;
    
    public EventBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public EventBuilder setDate(LocalDateTime date) {
        this.date = date;
        return this;
    }
    
    public EventBuilder setEndDate(LocalDateTime endDate){
        this.endDate = endDate;
        return this;
    }

    public EventBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public Event create() {
        return new Event(title, date, description, endDate);
    }

    
}
