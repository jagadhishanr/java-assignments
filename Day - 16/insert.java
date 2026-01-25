// Write a program to implement Queue using Array with all operation
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();

        System.out.print("Enter element to insert at front: ");
        deque.addFirst(sc.nextInt());

        System.out.print("Enter element to insert at rear: ");
        deque.addLast(sc.nextInt());

        System.out.println("Deque after insertion:");
        System.out.println(deque);

        sc.close();
    }
}
