import java.util.Scanner;

public class Passwordcheck {

	public static void main(String[] args) {
		Scanner strong = new Scanner(System.in);
		String password = strong.nextLine();
		if(password.length()<8) {
			System.out.print("Weak password");
		}
		else {
			System.out.print("Strong password");
		}


	}

}