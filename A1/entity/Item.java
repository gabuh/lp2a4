package entity;

import java.time.LocalDateTime;

public interface Item {
    public String getTitle();
    public LocalDateTime getDate();
    public void showDetails();
}
