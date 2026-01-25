// 3.Write a program to store employee IDs in a Set and prevent duplicates
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class preventduplicates {
    public static void main(String[] args) {

        Scanner link = new Scanner(System.in);
        Set<Integer> employeeIds = new HashSet<>();

        System.out.print("Enter number of employee IDs: ");
        int n = link.nextInt();

        System.out.println("Enter employee IDs:");
        for (int i = 0; i < n; i++) {
            int id = link.nextInt();

            if (!employeeIds.add(id)) {
                System.out.println("Duplicate ID not allowed: " + id);
            }
        }

        System.out.println("Stored Employee IDs:");
        System.out.println(employeeIds);

        link.close();
    }
}
