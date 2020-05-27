package simpleApp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App1 {

    public static void main(String[] args) throws SQLException {

        try (Connection conn = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/mysql_db?serverTimezone=UTC",
                        "root", "coderslab")) {
            System.out.println("Connected successful");
        } catch (Exception e) {
            System.out.println("Unable to connect");
            e.printStackTrace();
        }


    }
}
