public class Admin extends User {

    public Admin(String username, String email){
        super(username, email);
        System.out.println("A new Admin has been created");
    }

    @Override
    public void login(){
//        super.login();
        System.out.println("Admin logged in!");
        System.out.println("Email: " + email);

        /*
        User user = new User();
        user.signUp("Ali" , "1234");
        user.signUp("mohamamd", "1323");
        user.login("samer" , "123");


        User ali = new User();
        User samer = new User();

         */



    }


}
