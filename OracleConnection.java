public class OracleConnection implements DatabaseConnection{
    @Override
    public void connect() {
        System.out.println("Connecting to Oracle database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from Oracle database...");
    }

    @Override
    public void save(String data) {
        System.out.println("Saving data to Oracle database...");
    }

    @Override
    public void delete(String id) {
        System.out.println("Deleting data from Oracle database...");
    }

    @Override
    public void update(String id, String data) {
        System.out.println("Updating data in Oracle database...");
    }
}
