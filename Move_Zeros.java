import java.util.Arrays;

public class Move_Zeros {
    public static int[] check(int[] nums){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return nums;

    }
    public static void main(String[] args) {
        int[] a={1,0,0,3,12};
        int[] b=check(a);
        System.out.println(Arrays.toString(b));
    }
    
}
