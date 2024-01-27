package homework9;

public class Register {
    public static void main(String[] args) {

        try {
            registerValidation("sdfsfsfefesf", "aaa2A","aaa2A" );
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void registerValidation(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Incorrect login");
        }
        if ((!password.equals(confirmPassword)) || (password.length() >= 20)|| (!password.matches(".*[0-9].*"))){
            throw new WrongPasswordException("Incorrect password");
        }
    }
}
