import java.util.HashMap;
import java.util.HashSet;

public class Unique_Number_of_Occurences {
    public static boolean check(int[] nums){
        HashMap<Integer,Integer> d=new HashMap<>();
        HashSet<Integer> seen=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!d.containsKey(nums[i])){
                d.put(nums[i], 1);
            }
            else{
                d.put(nums[i], d.get(nums[i])+1);
            }
        }
        for(int num:d.keySet()){
            if(!seen.contains(num)){
                seen.add(num);
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a={4,4,5}; // this shows true cause 4:2 5:1 so frequcy are different (2 and 1 is not same)
        boolean s=check(a);
        System.out.println(s);
    }
    
}
