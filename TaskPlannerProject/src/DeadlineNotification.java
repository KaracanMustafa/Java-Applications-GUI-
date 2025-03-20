
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karac
 */
public class DeadlineNotification extends MessageDecorator{
    private Notification decorator;
    private List<Task> tasks;

    public DeadlineNotification(Notification decorator, List<Task> tasks) {
        this.decorator = decorator;
        this.tasks = tasks;
    }

    @Override
    public String getNotification() {
        String notification=decorator.getNotification();
        StringBuilder sb = new StringBuilder();
        sb.append(decorator.getNotification());
        for (Task task : tasks) {
            if (java.time.LocalDate.now().plusDays(1).toString().equals(task.getDeadline())) {
                notification= notification +"\n"+task.getName()+" is due tomorrow";
            }
        }
        return notification;
    }
}
