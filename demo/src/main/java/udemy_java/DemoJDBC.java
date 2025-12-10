package udemy_java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoJDBC {

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String pass = "1001";

        try (Connection con = DriverManager.getConnection(url, username, pass)) {
            System.err.println("Connected to the PostgreSQL server successfully.");
            // Здесь вы можете выполнять операции с базой данных, используя объект `con`
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

