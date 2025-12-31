import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Do you want to continue? (y/n)");
            choice = hi.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program ended.");
        sc.close();
    }
}
