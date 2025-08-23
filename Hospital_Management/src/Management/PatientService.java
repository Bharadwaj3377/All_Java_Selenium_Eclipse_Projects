package Management;

import java.sql.*;
import java.util.Scanner;

public class PatientService {

    public static void registerPatient(Scanner sc) {
        try (Connection con = Details_.getConnection()) {
            System.out.print("👤 Name: ");
            String name = sc.nextLine();

            System.out.print("🎂 Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // Clear newline

            System.out.print("⚧ Gender: ");
            String gender = sc.nextLine();

            System.out.print("📞 Phone: ");
            String phone = sc.nextLine();

            System.out.print("🏠 Address: ");
            String address = sc.nextLine();

            String sql = "INSERT INTO patients (name, age, gender, phone, address) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, gender);
            ps.setString(4, phone);
            ps.setString(5, address);
            ps.executeUpdate();

            System.out.println("✅ Patient registered successfully.");
        } catch (SQLIntegrityConstraintViolationException dup) {
            System.out.println("❌ Duplicate entry or constraint failed.");
        } catch (SQLException e) {
            System.out.println("❌ Database error: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void viewPatients() {
        try (Connection con = Details_.getConnection()) {
            String sql = "SELECT * FROM patients";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.printf("\n%-5s %-20s %-5s %-10s %-15s %-30s\n", "ID", "Name", "Age", "Gender", "Phone", "Address");
            System.out.println("------------------------------------------------------------------------------------------");
            while (rs.next()) {
                System.out.printf("%-5d %-20s %-5d %-10s %-15s %-30s\n",
                        rs.getInt("patient_id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("gender"),
                        rs.getString("phone"),
                        rs.getString("address"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
