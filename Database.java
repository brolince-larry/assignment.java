// Java program to implement a simple JDBC application
import java.sql.*;

public class Database {
    public static void main(String[] args)
    {
        // Database URL, username, and password

        // Replace with your database name
        String url
            = "jdbc:mysql://localhost:3306/student";

        // Replace with your MySQL username
        String username = "localhost";

        // Replace with your MySQL password
        String password = "";

        // Updated query syntax for modern databases
        String query
            = "INSERT INTO students (first, second, email, password) VALUES (1, 'bhatt', 'larry@gmail.com', '1293')";

        // Establish JDBC Connection
        try {
          
            // Load Type-4 Driver
            // MySQL Type-4 driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection c = DriverManager.getConnection(
                url, username, password);

            // Create a statement
            Statement st = c.createStatement();

            // Execute the query
            int count = st.executeUpdate(query);
            System.out.println(
                "Number of rows affected by this query: "
                + count);

            // Close the connection
            st.close();
            c.close();
            System.out.println("Connection closed.");
        }
        catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: "
                               + e.getMessage());
        }
        catch (SQLException e) {
            System.err.println("SQL Error: "
                               + e.getMessage());
        }
    }
}

