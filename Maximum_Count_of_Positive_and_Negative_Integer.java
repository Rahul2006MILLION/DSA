import java.util.*;
public class Maximum_Count_of_Positive_and_Negative_Integer {
    public static int check(int[] nums){
        int neg=0;
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg+=1;
            }
            if(nums[i]>0){
                pos+=1;
            }
        }
        return Math.max(neg,pos);
    }
    public static void main(String[] args) {
        int[] a={-2,-1,-1,1,2,3};
        int b=check(a);
        System.out.println(b);
    }
}
