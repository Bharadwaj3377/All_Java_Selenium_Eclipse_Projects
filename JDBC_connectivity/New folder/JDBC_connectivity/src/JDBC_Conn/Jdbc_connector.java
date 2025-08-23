package JDBC_Conn;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

	public class Jdbc_connector {
	    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	        // Import packages
	        // create object for connection
	        // retrieve data
	        // close connection

	        String url = "jdbc:mysql://localhost:3306/mydb";
	        String user = "root";
	        String password = "bharadwaj333";

	        Class.forName("com.mysql.cj.jdbc.Driver");

	        Connection con = DriverManager.getConnection(url, user, password);
	        System.out.println("Connection created");
	        Statement stmt=con.createStatement();
	        ResultSet rs=stmt.executeQuery("Select * from Employee ");
	        System.out.println("ID\t name\t salary\t phonenumber");
	        while(rs.next())
	        {
	        	int id=rs.getInt("Id");
	        	String name=rs.getString("name");
	        	int salary=rs.getInt("Salary");
	        	long phonenumber=rs.getLong("phonenumber");
	        	
	        	System.out.println("ID: "+id+" \tName:"+ name+"\tsalary : "+salary + "\tPhone number : "+phonenumber);
	        }
	        rs.close();
	        stmt.close();
	        con.close();
	    }
	}
