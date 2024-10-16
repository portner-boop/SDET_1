package Lection2;

public class ValidateUser {
    public static class LoginPass extends Exception {
        public LoginPass(){
            super();
        }
        public LoginPass(String message){
            super(message);
        }
    }
    public static class PassportPass extends Exception{
        public PassportPass(){
            super();
        }
        public PassportPass(String message){
            super(message);
        }
    }
    public static boolean validateUser(String login, String pass1,String pass2) throws LoginPass , PassportPass {
        try{
            if(!(isGood(login))){
                throw new LoginPass("Login Error");
            }
            if(!(isGoodPass(pass1,pass2))){
                throw new PassportPass("Error Passport");
            }
            return true;
        } catch (LoginPass | PassportPass e) {
            System.err.println("Error: " + e.getMessage());
            return false;
        }
    }
    private static boolean isGood(String login){
        if(login.length()>=20){
            return false;
        }
        return true;
    }
    private static boolean isGoodPass(String pass1,String pass2){
        if (pass1.length()>=20 || !(pass2.equals(pass1))){
            return false;
        }return true;
    }
    
}
