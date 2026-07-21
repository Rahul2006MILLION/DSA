import java.util.*;

public class Height_Checker {
    public static int check(int[] heights){
        int c=0;
        int[] a=heights.clone();
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++){
            if(a[i]!=heights[i]){
                c+=1;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[] v={1,1,4,2,1,3}; //Check for this [5,1,2,3,4] u will get 5 :)
        int g=check(v);
        System.out.println(g);
    }
    
}
