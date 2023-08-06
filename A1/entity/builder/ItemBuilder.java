package entity.builder;

import java.time.LocalDateTime;

import entity.Reminder;

public interface ItemBuilder {
    public ItemBuilder setTitle(String title);
    public ItemBuilder setDate(LocalDateTime date);
    public Reminder create();
}
