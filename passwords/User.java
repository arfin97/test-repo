package passwords;

public class User {
    private String userName;
    private String password;

    private PasswordEncryptor encryptor;

    public User(String userName, String password, PasswordEncryptor encryptor) {
        this.encryptor = encryptor;
        setUserName(userName);
        setPassword(password);
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = encryptor.encrypt(password);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
