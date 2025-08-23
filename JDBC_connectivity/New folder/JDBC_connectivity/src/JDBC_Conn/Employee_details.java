package JDBC_Conn;

import java.sql.*;

public class Employee_details {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "bharadwaj333";

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            // Call the procedure that returns salary and total salary (salary + 5000)
            CallableStatement cst = con.prepareCall("{CALL getdetailsbybonus()}");

            ResultSet rs = cst.executeQuery();

            System.out.println("\n👨‍💼 Employee Details with Bonus:");
            System.out.println("ID\tName\t\t\tSalary\t\tTotal Salary");
            System.out.println("--------------------------------------------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int salary = rs.getInt("salary");
                int totalSalary = rs.getInt("total_salary");

                System.out.printf("%d\t%-20s\t%d\t\t%d\n", id, name, salary, totalSalary);
            }

            rs.close();
            cst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
