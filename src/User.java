public class User {

    public String username;
    public String password;
    public String email;
    public String nickname;
    private String number;

    public void setNumber(String number){
        this.number = number;
    }

    public String getNumber(){
        return this.number;
    }

    public User(String username, String email){
        this.username = username;
        this.email = email;
        System.out.println("a new user has been created!");
    }

    public void login(){
        System.out.println(username + " has logged in!");
    }

    public void signUp(){
        System.out.println(username + " has signed up!");
    }

    public void buy(){
        System.out.println( username + " is buying!");
    }

}

