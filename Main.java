
public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService(new OracleConnection());
        userService.saveUser("John Doe");
    }
}
