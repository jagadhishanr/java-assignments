import java.util.Scanner;

class Table {
    synchronized void printTable(int n, int sleepTime) {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() +
                        " : " + (n * i));
                Thread.sleep(sleepTime);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

class MyThread extends Thread {
    Table t;
    int num;
    int sleepTime;

    MyThread(Table t, int num, int sleepTime) {
        this.t = t;
        this.num = num;
        this.sleepTime = sleepTime;
    }

    public void run() {
        t.printTable(num, sleepTime);
    }
}

public class SynchronizedSleep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Table obj = new Table();

        System.out.print("Enter number for table: ");
        int num = sc.nextInt();

        System.out.print("Enter sleep time in milliseconds: ");
        int time = sc.nextInt();

        MyThread t1 = new MyThread(obj, num, time);
        MyThread t2 = new MyThread(obj, num, time);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}
