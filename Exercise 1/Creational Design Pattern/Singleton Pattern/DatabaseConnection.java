public class DatabaseConnection {
    private static DatabaseConnection instance;
    private DatabaseConnection() {
        System.out.println("Connecting to the database...");
    }
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    public void close() {
        System.out.println("Closing the database connection...");
    }
}
