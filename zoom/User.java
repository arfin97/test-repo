package zoom;

public class User {
    private String name;
    private int age;
    private String email;
    private String password;
    private String address;
    private String phone;

    public User(String name, int age, String email, String password, String address, String phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Email: " + email + ", Password: " + password + ", Address: " + address + ", Phone: " + phone;
    }

    public int monthlyCharge() {
        return 0;
    }
}
