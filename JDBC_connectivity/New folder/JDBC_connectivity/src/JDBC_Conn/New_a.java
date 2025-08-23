package JDBC_Conn;

import java.sql.*;

public class New_a {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "bharadwaj333";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        Statement stmt = con.createStatement();

        // Create tables
        stmt.execute("CREATE TABLE IF NOT EXISTS learners (rollno INT, name VARCHAR(50), per INT, email VARCHAR(50), city VARCHAR(50))");
        stmt.execute("CREATE TABLE IF NOT EXISTS colleges (college_id INT, rollno INT, college_name VARCHAR(50))");

        // Insert learners
        stmt.execute("INSERT INTO learners VALUES (301, 'Raj', 86, 'raj@mail.com', 'Guntur')");
        stmt.execute("INSERT INTO learners VALUES (302, 'Divya', 91, 'divya@mail.com', 'Vijayawada')");
        stmt.execute("INSERT INTO learners VALUES (303, 'Kiran', 78, 'kiran@mail.com', 'Guntur')");
        stmt.execute("INSERT INTO learners VALUES (304, 'Sita', 95, 'sita@mail.com', 'Vizianagaram')");

        // Insert colleges
        stmt.execute("INSERT INTO colleges VALUES (401, 301, 'Sri Chaitanya College')");
        stmt.execute("INSERT INTO colleges VALUES (402, 302, 'Aditya Degree College')");
        stmt.execute("INSERT INTO colleges VALUES (403, 305, 'Andhra Loyola College')");

        // Display learners table
        ResultSet rs = stmt.executeQuery("SELECT * FROM learners");
        System.out.println("\nLearners Table:");
        while (rs.next()) {
            System.out.println(rs.getInt("rollno") + " " + rs.getString("name") + " " + rs.getInt("per") + " " + rs.getString("email") + " " + rs.getString("city"));
        }

        // Update record
        stmt.executeUpdate("UPDATE learners SET per = 96 WHERE rollno = 301");

        // Highest percentage
        rs = stmt.executeQuery("SELECT * FROM learners WHERE per = (SELECT MAX(per) FROM learners)");
        System.out.println("\nTop Scorers:");
        while (rs.next()) {
            System.out.println(rs.getString("name") + " - " + rs.getInt("per") + "%");
        }

        // Order by name
        rs = stmt.executeQuery("SELECT * FROM learners ORDER BY name ASC");
        System.out.println("\nLearners in Ascending Order:");
        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }

        // Same city students
        rs = stmt.executeQuery(
            "SELECT l.city, l.name FROM learners l " +
            "JOIN (SELECT city FROM learners GROUP BY city HAVING COUNT(*) > 1) c " +
            "ON l.city = c.city"
        );
        System.out.println("\nLearners from Same City:");
        while (rs.next()) {
            System.out.println(rs.getString("city") + " - " + rs.getString("name"));
        }

        // Alter table
        stmt.execute("ALTER TABLE learners ADD gender VARCHAR(10)");
        stmt.execute("ALTER TABLE learners MODIFY gender CHAR(1)");
        stmt.execute("RENAME TABLE learners TO learner_info");
        stmt.execute("ALTER TABLE learner_info DROP COLUMN gender");

        // Inner join
        rs = stmt.executeQuery("SELECT l.rollno, l.name, c.college_name FROM learner_info l INNER JOIN colleges c ON l.rollno = c.rollno");
        System.out.println("\nInner Join (Matched Records):");
        while (rs.next()) {
            System.out.println(rs.getInt("rollno") + " " + rs.getString("name") + " - " + rs.getString("college_name"));
        }

        // Left join
        rs = stmt.executeQuery("SELECT l.name, c.college_name FROM learner_info l LEFT JOIN colleges c ON l.rollno = c.rollno");
        System.out.println("\nLeft Join (All Learners):");
        while (rs.next()) {
            System.out.println(rs.getString("name") + " - " + rs.getString("college_name"));
        }

        // Right join
        rs = stmt.executeQuery("SELECT l.name, c.college_name FROM learner_info l RIGHT JOIN colleges c ON l.rollno = c.rollno");
        System.out.println("\nRight Join (All Colleges):");
        while (rs.next()) {
            System.out.println(rs.getString("name") + " - " + rs.getString("college_name"));
        }

        // Union (Full outer simulation)
        rs = stmt.executeQuery(
            "(SELECT l.name, c.college_name FROM learner_info l LEFT JOIN colleges c ON l.rollno = c.rollno) " +
            "UNION " +
            "(SELECT l.name, c.college_name FROM learner_info l RIGHT JOIN colleges c ON l.rollno = c.rollno)"
        );
        System.out.println("\nFull Outer Join (All Records):");
        while (rs.next()) {
            System.out.println(rs.getString("name") + " - " + rs.getString("college_name"));
        }

        // Delete one row
        stmt.execute("DELETE FROM learner_info WHERE rollno = 303");
        System.out.println("\nDeleted rollno 303");

        // Truncate table
        stmt.execute("TRUNCATE TABLE learner_info");
        System.out.println("All learner records deleted");

        // Drop table
        stmt.execute("DROP TABLE learner_info");
        System.out.println("learner_info table dropped");

        rs.close();
        stmt.close();
        con.close();
    }
}
