// Write a Java program to check whether a number is even or odd
import java.util.Scanner;
public class evenorodd{
    public static void main(String[]args){
        Scanner jagan = new Scanner(System.in);
        int store = jagan.nextInt();
        if(store%2==0){
            System.out.println("Number is even");
        }
        else{
             System.out.println("Number is odd");
        }
        jagan.close();
        
    }
}
