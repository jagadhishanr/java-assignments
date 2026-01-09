public class index{
    public static void main(String[]args){
        int[]evenIndex = {1,2,3,4,5,6,7,8};
        for(int i = 0; i<evenIndex.length; i+=2){
            System.out.println("The EVEN index of array elements are: " + i + " "+ " = " + evenIndex[i]);
        }
    }
}