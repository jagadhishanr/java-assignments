import java.util.Scanner;
public class printElement{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("print the array size");
        int n = scan.nextInt();
        int[]size = new int[n];

        System.out.println("Now print the array elements");
        for(int i =0; i<n; i++){
            size[i] = scan.nextInt();
        }

        for(int i=0; i<n; i++){
            System.out.println("now your's printed array elements are:"+ " "+ size[i]);
        }

        }
    }
