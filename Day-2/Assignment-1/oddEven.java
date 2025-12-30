public class oddEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int check = scan.nextInt();
		if(check%2==0) {
			System.out.print("Even");
		}
		else {
			System.out.print("Odd");
		}
	}

}