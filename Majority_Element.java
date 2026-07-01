import java.util.*;

public class Majority_Element {
    public static int check(int[] nums){
        HashMap<Integer,Integer> d=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(!d.containsKey(nums[i])){
                d.put(nums[i], 0);
            }
            d.put(nums[i],d.get(nums[i])+1);
        }
        for(Integer i:d.keySet()){
            if(d.get(i)>n/2){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={2,2,1,1,1,2,2};
        int b=check(a);
        System.out.println(b);

    }
    
}
