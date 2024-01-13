public class UserService {
    DatabaseConnection databaseConnection;

    public UserService(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    public void saveUser(String user) {
        databaseConnection.connect();
        databaseConnection.save(user);
        databaseConnection.disconnect();
    }

    public void deleteUser(String id) {
        databaseConnection.connect();
        databaseConnection.delete(id);
        databaseConnection.disconnect();
    }

    public void updateUser(String id, String user) {
        databaseConnection.connect();
        databaseConnection.update(id, user);
        databaseConnection.disconnect();
    }
}
