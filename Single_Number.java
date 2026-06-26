import java.util.*;
public class Single_Number {
    public static int check(int[] nums){
        HashMap<Integer,Integer> d=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!d.containsKey(nums[i])){
                d.put(nums[i],0);
            }
            d.put(nums[i], d.get(nums[i])+1);
        }
        
        for(Integer k:d.keySet()){
            if(d.get(k)==1){
                return k;

            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] a={2,2,1,1,4};
        int b=check(a);
        System.out.println(b);
    }
    
}
