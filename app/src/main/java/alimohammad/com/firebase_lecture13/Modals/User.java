package alimohammad.com.firebase_lecture13.Modals;

public class User {

    private String username;
    private String password;
    private String message;
    private String dateOfSend;


    public void setUsername(String username){
        this.username = username;
    }

    public User(){
        //For Firebase Database
    }

    public User(String username, String password, String message, String dateOfSend) {
        this.username = username;
        this.password = password;
        this.message = message;
        this.dateOfSend = dateOfSend;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getMessage() {
        return message;
    }

    public String getDateOfSend() {
        return dateOfSend;
    }
}
