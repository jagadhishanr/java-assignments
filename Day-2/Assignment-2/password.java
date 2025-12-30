import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner valid = new Scanner(System.in);
        String password;

        while (true) {
            System.out.print("Enter password: ");
            password = valid.nextLine();

            if (password.length() < 8) {
                System.out.println("Password too short");
            } else {
                System.out.println("Password accepted");
                break;
            }
        }
    }
}
