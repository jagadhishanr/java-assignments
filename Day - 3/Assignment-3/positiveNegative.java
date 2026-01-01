import java.util.Scanner;
public class positiveNegative{
    public static void main (String args[]){
        
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num>0){
            System.out.print("Number is posive +ve");
        }
        else if(num<0){
            System.out.print("Number is negative -ve");
        }
        else{
            System.out.print("Number is zero");
        }
        scan.close();
    }

}