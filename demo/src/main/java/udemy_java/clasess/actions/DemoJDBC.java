package udemy_java.clasess.actions;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DemoJDBC {

public static void main() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        // String pass = "1001";
        String pass = "0000"; // work mack

        Connection con = null;

        try {
            con = DriverManager.getConnection(url, username, pass);
            System.err.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // String sql = "SELECT \"sName\" FROM student WHERE \"sID\" = 1";

        // String sql = "SELECT * FROM student";
        Statement st = null;
        ResultSet res = null;
        
        try {
            st = con.createStatement();
            // res = st.executeQuery(sql);

            // res.next();
            // String name = res.getString("sName");
            // System.err.println("Name of the student is " + name);

// -- - - - - - - - - -- - - - - 

            //take whle data

            // while (res.next()) {
            //     System.err.print(res.getInt(1) + " - ");
            //     System.err.print(res.getString(2) + " - ");
            //     System.err.println(res.getInt(3));
            // }

// -- - - - - - - - - -- - - - - 
            //INSERT
            // String sql = "insert into student values(3, 'John', 44)";
            // UPDATING DATA
            // String sql = "update student set \"sName\"='Max' where \"sID\"=3 ";
            // DELETING
            // String sql = "delete from student where \"sID\"=3 ";

            // boolean status = st.execute(sql);

            // System.err.println(status);
// - - - - - - - - - - - - - - 
            //prepared statement

            int sID = 102;
            String sName = "Big";
            int marks = 64;
            String sql = "insert into student values (?,?,?)";
            
            PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, sID);
                pst.setString(2, sName);
                pst.setInt(3, marks);

            pst.execute();

            con.close();    
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

