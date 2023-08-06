package entity;

import java.time.LocalDateTime;

import entity.builder.ItemBuilder;

public class TaskBuilder implements ItemBuilder{

    private String description;
    private String title;
    private LocalDateTime date;


    public TaskBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public TaskBuilder setDate(LocalDateTime date) {
        this.date = date;
        return this;
    }
    
    public TaskBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    

    public Task create() {
        return new Task(title, date, description);
    }



}
