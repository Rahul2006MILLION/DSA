import java.util.*;
public class Find_Numbers_with_Even_Number_of_Digits {
    public static int check(int[] n){
        int count=0;
        for(int i=0;i<n.length;i++){
            String a=String.valueOf(n[i]);
            int b=a.length();
            if(b%2==0){
                count+=1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a={12,345,2,6,7896}; // Try also this:- {555,901,482,1771}
        int b=check(a);
        System.out.println(b);
    }
    
}
