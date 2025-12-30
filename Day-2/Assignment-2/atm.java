import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner atm = new Scanner(System.in);
        int correctPin = 1234;
        int pin;
        while (true) {
            System.out.print("Enter ATM PIN: ");
            pin = atm.nextInt();
            if (pin == correctPin) {
                System.out.println("Correct PIN!");
                break;
            } else {
                System.out.println("Wrong PIN, try again.");
            }
        }
    }
}