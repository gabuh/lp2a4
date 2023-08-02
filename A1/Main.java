import entity.*;

public class Main {
    public static void main(String[] args) {
        Task item = new TaskBuilder().setTitle("get out").create();
        System.out.println(item.getTitle());
    }
}
