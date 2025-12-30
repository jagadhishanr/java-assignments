public class userlogin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String username = scan.nextLine();
		String password = scan.nextLine();
		if(username.equals("jagan") && password.equals("pass")) {
			System.out.print("Login successful");
		}
		else {
			System.out.print("invalid credentials");
		}
		

	}

}