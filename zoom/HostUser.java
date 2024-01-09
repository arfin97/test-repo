package zoom;

public class HostUser extends User {
    private String hostId;
    private int monthlyHostCharge;

    public HostUser(String name, int age, String email, String password, String address, String phone, String hostId, int monthlyCharge) {
        super(name, age, email, password, address, phone);
        this.hostId = hostId;
        this.monthlyHostCharge = monthlyCharge;
    }

    @Override
    public String toString() {
        return super.toString() + ", HostId: " + hostId + ", MonthlyCharge: " + monthlyHostCharge;
    }

    public int getMonthlyHostCharge() {
        return monthlyHostCharge;
    }

    @Override
    public int monthlyCharge() {
        return 30 * monthlyHostCharge;
    }

    public void printParent(){
        System.out.println(super.toString());
    }

}
