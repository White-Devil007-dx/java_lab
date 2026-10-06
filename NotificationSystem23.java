interface Notifiable {
    void sendNotification(String message);
}

class EmailNotification implements Notifiable {
    public void sendNotification(String message) {
        System.out.println("Email: " + message);
    }
}

class SMSNotification implements Notifiable {
    public void sendNotification(String message) {
        System.out.println("SMS: " + message);
    }
}

class PushNotification implements Notifiable {
    public void sendNotification(String message) {
        System.out.println("Push Notification: " + message);
    }
}

public class NotificationSystem23 {
    public static void main(String[] args) {
        String message = "Your account has been successfully updated.";

        Notifiable email = new EmailNotification();
        Notifiable sms = new SMSNotification();
        Notifiable push = new PushNotification();

        email.sendNotification(message);
        sms.sendNotification(message);
        push.sendNotification(message);
    }
}