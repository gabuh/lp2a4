package entity;

import java.time.LocalDateTime;

import entity.builder.ItemBuilder;

public class ReminderBuilder implements ItemBuilder {
    private String title;
    private LocalDateTime date;

    public ReminderBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public ReminderBuilder setDate(LocalDateTime date) {
        this.date = date;
        return this;
    }

    public Reminder create() {
        return new Reminder(title, date);
    }
    
}
