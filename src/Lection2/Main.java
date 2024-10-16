package Lection2;

public class Main {
    public static void main(String[] args) throws ValidateUser.LoginPass, ValidateUser.PassportPass {
        String login = "sgd";
        String pass1 = "sgdsdg";
        String pass2 = "sgdsdq";
        boolean check = ValidateUser.validateUser(login,pass1,pass2);
        if (check) {
            System.out.println("Login Success");
        }
    }

}
