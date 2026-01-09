import java.util.Scanner;

public class Sumdigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = findSumOfDigits(number);
        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }

    public static int findSumOfDigits(int num) {
        int sum = 0;
        num = Math.abs(num); // handle negative numbers

        while (num > 0) {
            sum += num % 10; // get last digit
            num /= 10;       // remove last digit
        }
        return sum;
    }
}
