import java.util.Scanner;

public class MainThreadSleep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a message to display after sleep: ");
        String msg = sc.nextLine();

        try {
            System.out.println("Main thread sleeping for 3 seconds...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("Message: " + msg);
    }
}
