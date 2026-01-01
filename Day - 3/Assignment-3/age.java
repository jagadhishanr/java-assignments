import java.util.Scanner;
public class age {
    public static void main(String[] args) {
System.out.print("Age validation");
Scanner scan = new Scanner(System.in);
int age = scan.nextInt();
System.out.print("Enter your AGE: " + age);
if(age<18){
    System.out.print("you are not an adult");
}
else if(age>=18 && age<=60){
    System.out.print("you are now an adult");
}
scan.close();
    }
}