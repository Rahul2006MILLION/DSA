import java.util.*;

public class The_Two_Sneaky_Numbers_of_Digitville {
    public static List<Integer> check(int[] nums){
        HashSet<Integer> seen=new HashSet<>();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!seen.contains(nums[i])){
                seen.add(nums[i]);
            }
            else{
                l.add(nums[i]);
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int[] p={0,3,2,1,3,2};
        List<Integer> b=check(p);
        System.out.println(b);
    }
    
}
