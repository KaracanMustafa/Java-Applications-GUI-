/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karac
 */
public class BasicNotification extends Notification{
    private String day;
    private String date;

    public BasicNotification(String day, String date) {
        this.day = day;
        this.date = date;
    }

    @Override
    public String getNotification() {
        return "Day: " + day+", Date: " + date;
    }
}
