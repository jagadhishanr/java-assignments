import java.util.Scanner;

public class mobile {
    public static void main(String[] args) {
        Scanner phone = new Scanner(System.in);
        String mobile;

        do {
            System.out.print("Enter a 10-digit mobile number: ");
            mobile = phone.next();
        } while (mobile.length() != 10);

        System.out.println("Valid mobile number entered.");
        
    }
}
