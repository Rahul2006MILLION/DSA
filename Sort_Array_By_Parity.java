import java.util.Arrays;

public class Sort_Array_By_Parity {
    public static int[] check(int[] nums){
        int left=0;
        int right=nums.length-1;
        int temp=0;
        while (left<right) {
            if(nums[left]%2!=0 && nums[right]%2==0){
                temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left+=1;
                right-=1;
            }
            else if(nums[left]%2==0){
                left+=1;
            }
            else{
                right-=1;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] p={3,1,2,4};
        int[] y=check(p);
        System.out.println(Arrays.toString(y));
    }
    
}
