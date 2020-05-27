package simpleApp.app;

import java.sql.*;

public class App1 {

    public static void main(String[] args) throws SQLException {

        try (Connection conn = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/mysql_db?serverTimezone=UTC",
                        "root", "coderslab")) {
            System.out.println("Connected successful");
            Statement statement = conn.createStatement();
            String sqlQuery = "select * from employees";
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String surname = resultSet.getString(2);
                String name = resultSet.getString(3);
                String email = resultSet.getString(4);
                String department = resultSet.getString(5);
                int salary = resultSet.getInt(6);
                System.out.printf("%d. Employee: %s %s, Email: %s, Department: %s, Salary: %,d \n",id,name,surname,email,department,salary);
            }

        } catch (SQLException e) {
            System.out.println("Unable to connect");
            e.printStackTrace();
        }




    }
}
