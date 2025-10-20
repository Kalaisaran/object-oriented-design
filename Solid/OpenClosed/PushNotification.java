package Solid.OpenClosed;

public class PushNotification implements Notification {

    @Override
    public void sendMessage(String message) {
        System.out.println("Push Notification " + message);
    }
}
