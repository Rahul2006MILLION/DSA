import java.util.Arrays;
import java.util.HashMap;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static int[] check(int[] nums){
        HashMap<Integer,Integer> d=new HashMap<>();
        int[] a=Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(!d.containsKey(nums[i])){
                d.put(nums[i], i);
            }
        }
        for(int i=0;i<a.length;i++){
            res[i]=d.get(a[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] f={8,1,2,2,3};
        int[] x=check(f);
        System.out.println(Arrays.toString(x));
    }

    
}
