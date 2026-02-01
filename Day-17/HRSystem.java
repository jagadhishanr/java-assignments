import java.util.Scanner;

public class HRSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new UnderAgeException("Registration failed: Age must be 18 or above.");
            }
            System.out.println("Employee registered successfully.");
        } catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
