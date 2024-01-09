package zoom;

public class BasicUser extends User {

    private int monthlyBasicCharge;

    public BasicUser(String name, int age, String email, String password, String address, String phone, int monthlyBasicCharge) {
        super(name, age, email, password, address, phone);
        this.monthlyBasicCharge = monthlyBasicCharge;
    }

    public int getMonthlyBasicCharge() {
        return monthlyBasicCharge;
    }

    @Override
    public int monthlyCharge() {
        return 30 * monthlyBasicCharge;
    }
}
