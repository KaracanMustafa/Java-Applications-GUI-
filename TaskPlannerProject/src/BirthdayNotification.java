/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.time.LocalDate;
/**
 *
 * @author karac
 */
public class BirthdayNotification extends MessageDecorator{
    Notification notification;
    private LocalDate birthdate;

    public BirthdayNotification(Notification notification, LocalDate birthdate) {
        this.notification=notification;
        this.birthdate = birthdate;
    }

    @Override
    public String getNotification() {
        LocalDate today=LocalDate.now();
        if(today.getDayOfMonth()==birthdate.getDayOfMonth() && today.getMonth()==birthdate.getMonth()){
            return notification.getNotification()+ " Happy Birthday";
        }
        return notification.getNotification();
    }
}