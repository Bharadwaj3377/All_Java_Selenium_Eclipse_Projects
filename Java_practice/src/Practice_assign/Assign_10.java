package Practice_assign;



import java.io.FileWriter;
import java.io.IOException;

public class Assign_10 {
    public static void main(String[] args) {
        try {
            // Create FileWriter object (will create file if it doesn't exist)
            FileWriter writer = new FileWriter("student.txt");

            // Write 5 student names (each on a new line)
            writer.write("Bharadwaj\n");
            writer.write("Anu\n");
            writer.write("Raj\n");
            writer.write("Mohitha\n");
            writer.write("Vikram\n");

            // Close the FileWriter
            writer.close();

            System.out.println("Successfully wrote student names to student.txt");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
