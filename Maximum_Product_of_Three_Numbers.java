import java.util.*;
public class Maximum_Product_of_Three_Numbers {
    public static int check(int[] nums){
        int mul=1;
        int mulrev=1;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>nums.length-4;i--){
            mulrev*=nums[i];
        }
        mul=nums[0]*nums[1]*nums[nums.length-1];
        int max=mul;
        if(mulrev>max){
            max=mulrev;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a={-100, -98, -1, 2, 3, 4}; //try for this {3,2,1,4} :)
        int v=check(a);
        System.out.println(v);
    }
    
}
