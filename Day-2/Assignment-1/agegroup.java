import java.util.Scanner;

public class agegroup {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		if(age<13) {
			System.out.print("child");
		}
		else if(age<20) {
			System.out.print("Teenager");
		}
		else if(age<60) {
			System.out.print("Adult");
		}
		else {
			System.out.print("Senior citizen");
		}

	}

}