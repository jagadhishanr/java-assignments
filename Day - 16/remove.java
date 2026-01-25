// Write a program to remove elements from both ends of a Deque
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            deque.add(sc.nextInt());
        }

        System.out.println("Deque: " + deque);

        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Removed from rear: " + deque.removeLast());

        System.out.println("Deque after removal:");
        System.out.println(deque);

        sc.close();
    }
}
