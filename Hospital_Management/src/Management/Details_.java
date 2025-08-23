package Management;

import java.sql.Connection;
import java.sql.DriverManager;

public class Details_ {

    // ✅ These should be class-level constants
    private static final String URL = "jdbc:mysql://localhost:3306/hospital_db";
    private static final String USER = "root";
    private static final String PASSWORD = "bharadwaj333";

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
