import java.util.Scanner;
public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        try {
            System.out.print("Enter index to access: ");
            int index = sc.nextInt();
            System.out.println("Element: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range!");
        }
    }
}
