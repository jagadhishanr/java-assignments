public class replaceNeg{
    public static void main(String[]args){
        int [] replace = {12,-45,67,-77,-88,-90};
        for(int i =0;i<replace.length;i++){
            if(replace[i]<0){
                replace[i]=0;
                
            }
            System.out.println(replace[i]);
        }
    }
}