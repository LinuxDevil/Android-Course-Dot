package alimohammad.com.firebase_lecture13.Modals;

public class Message {

    String message;
    String sender;

    public Message() {
    }

    public Message(String message, String sender) {
        this.message = message;
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public String getSender() {
        return sender;
    }
}
