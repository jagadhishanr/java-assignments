// Write a program to implement Queue using Array with all operation
import java.util.Scanner;

public class queue {
    static int front = 0, rear = -1, size;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        size = sc.nextInt();
        int[] queue = new int[size];

        System.out.print("Enter number of elements to insert: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (rear == size - 1) {
                System.out.println("Queue Overflow");
                break;
            }
            queue[++rear] = sc.nextInt();
        }

        System.out.println("Queue elements:");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        if (front <= rear) {
            System.out.println("\nDeleted element: " + queue[front++]);
        }

        sc.close();
    }
}
