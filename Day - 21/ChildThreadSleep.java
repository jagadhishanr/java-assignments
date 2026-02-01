import java.util.Scanner;

class NumberThread extends Thread {
    int sleepTime;

    NumberThread(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(sleepTime);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted");
        }
    }
}

public class ChildThreadSleep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sleep time in milliseconds: ");
        int time = sc.nextInt();

        NumberThread t = new NumberThread(time);
        t.start();
    }
}
