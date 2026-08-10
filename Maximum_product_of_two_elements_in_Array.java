import java.util.*;
public class Maximum_product_of_two_elements_in_Array {
    public static int check(int[] nums){
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
    public static void main(String[] args) {
        int[] a={3,4,5,2};
        int b=check(a);
        System.out.println(b);
    }
    
}
