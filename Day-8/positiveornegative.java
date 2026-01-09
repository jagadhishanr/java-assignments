import java.util.Scanner;
public class positiveornegative{
    public static void main(String[]args){
Scanner scan = new Scanner(System.in);
int number = scan.nextInt();
if(number>0){
    System.out.println("Number is positive");
}
else if(number<0){
    System.out.println("Number is negative");
}
else{
    System.out.println("Number is zero");
}
    }
}