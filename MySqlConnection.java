public class MySqlConnection implements DatabaseConnection{
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MySQL database...");
    }

    @Override
    public void save(String data) {
        System.out.println("Saving " + data + " to MySQL database...");
    }

    @Override
    public void delete(String id) {
        System.out.println("Deleting data from MySQL database...");
    }

    @Override
    public void update(String id, String data) {
        System.out.println("Updating data in MySQL database...");
    }
}
