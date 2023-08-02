package entity.builder;

import java.time.LocalDateTime;

import entity.Reminder;

public interface ReminderBuilder {
    public ReminderBuilder setTitle(String title);
    public ReminderBuilder setDate(LocalDateTime date);
    public Reminder create();
}
