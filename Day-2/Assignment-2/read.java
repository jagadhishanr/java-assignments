import java.util.Scanner;

public class read {
    public static void main(String[] args) {
        Scanner jagan = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Program is running...");
            System.out.print("Do you want to continue? (y/n): ");
            choice = jagan.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program ended.");
     
    }
}
