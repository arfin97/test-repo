public interface DatabaseConnection {
    void connect();
    void disconnect();
    void save(String data);

    void delete(String id);

    void update(String id, String data);
}
