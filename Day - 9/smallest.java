public class smallest{
    public static void main(String[]args){
        int [] small = {12,1,45,67,3};
        int smallest = small[0];
        for(int i =1; i<small.length; i++){
            if(small[i] < smallest){
            smallest=small[i];
            }
        }
        System.out.println("The smallest array number is:" + smallest);
    }
}