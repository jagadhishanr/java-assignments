

import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				int marks = scan.nextInt();
				if(marks>=40) {
					System.out.print("Pass");
				}
				else {
					System.out.print("fail");
				}

	}

}