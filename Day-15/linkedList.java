// 2.Write a program to insert an
//  element at the beginning and end of a LinkedList
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("Enter element to insert at beginning: ");
        int first = sc.nextInt();
        list.addFirst(first);

        System.out.print("Enter element to insert at end: ");
        int last = sc.nextInt();
        list.addLast(last);

        System.out.println("LinkedList after insertion:");
        System.out.println(list);

        sc.close();
    }
}
