import java.util.Arrays;

public class Running_Sum_of_1D_Array {
    public static int[] check(int[] nums){
        int s=0;
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            result[i]=s;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] v={1,2,3,4};
        int[] r=check(v);
        System.out.println(Arrays.toString(r));
    }
}
