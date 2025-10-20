package Solid.OpenClosed;

public class SMSNotification implements Notification {

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS Notification " + message);
    }
}
