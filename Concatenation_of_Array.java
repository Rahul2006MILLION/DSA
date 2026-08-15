import java.util.Arrays;

public class Concatenation_of_Array {
    public static int[] check(int[] nums){
        int[] a=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            a[i]=nums[i];
            a[i+nums.length]=nums[i];
        }

        return a;
    }
    public static void main(String[] args) {
        int[] x={1,2,1};
        int[] c=check(x);
        System.out.println(Arrays.toString(c));
    }
    
}
