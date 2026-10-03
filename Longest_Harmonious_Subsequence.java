import java.util.Arrays;
import java.util.Collection;

public class Longest_Harmonious_Subsequence {
    public static int check(int[] nums){
        int start=0;
        int end=1;
        int max=0;
        Arrays.sort(nums);
        while(end<nums.length){
            if(nums[end]-nums[start]==1){
                max=Math.max(max, (end-start)+1);
                end+=1;
            }
            else if(nums[end]-nums[start]>1){
                start+=1;
            }
            else{
                end+=1;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] u={1,3,2,2,5,2,3,7};
        int f=check(u);
        System.out.println(f);
    }
    
}
