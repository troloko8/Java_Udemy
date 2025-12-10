package udemy_java;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String pass = "1001";

        Connection con = null;

        try {
            con = DriverManager.getConnection(url, username, pass);
            System.err.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql = "SELECT \"sName\" FROM student WHERE \"sID\" = 1"; // Исправленный SQL-запрос
        Statement st = null;
        ResultSet res = null;
        
        try {
            st = con.createStatement();
            res = st.executeQuery(sql);
            res.next();
            String name = res.getString("sName");
            System.err.println("Name of the student is " + name);
            con.close();    
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
