import java.util.Scanner;
public class bankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter available balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter withdrawal amount: ");
        int withdraw = sc.nextInt();

        try {
            if (withdraw > balance) {
                throw new InsufficientBalanceException("Error: Insufficient balance!");
            }
            balance -= withdraw;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
