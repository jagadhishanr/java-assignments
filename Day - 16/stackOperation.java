// Write a Java program to implement Stack operations (push, pop, peek).
import java.util.Scanner;
import java.util.Stack;

public class StackOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter number of elements to push: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        System.out.println("Stack: " + stack);

        if (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
            System.out.println("Top element (peek): " + stack.peek());
        }

        System.out.println("Final Stack: " + stack);
        sc.close();
    }
}
