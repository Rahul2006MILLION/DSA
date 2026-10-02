import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum2_Input_Array_Is_Sorted {
    public static int[] check(int[] nums,int target){
        HashMap<Integer,Integer> d=new HashMap<>();
        int[] res=new int[2];
        int y=0;
        for(int i=0;i<nums.length;i++){
            y=target-nums[i];
            if(d.containsKey(y)){
                res[0]=d.get(y)+1;
                res[1]=i+1;
                return res;
            }
            d.put(nums[i],i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int t=9;
        int[] r=check(numbers, t);
        System.out.println(Arrays.toString(r));
    }
    
}
