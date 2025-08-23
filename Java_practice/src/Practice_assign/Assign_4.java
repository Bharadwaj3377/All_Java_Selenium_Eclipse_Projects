package Practice_assign;
import java.util.Scanner;

public class Assign_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input length and width
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();

        // Calculate area
        double area = length * width;

        // Output result
        System.out.println("Area of the rectangle = " + area);

        sc.close();
    }
}
