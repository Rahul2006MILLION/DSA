import java.util.ArrayList;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array {
    public static List<Integer> check(int[] nums){
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0){
                continue;
            }
            nums[index]*=-1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                l.add(i+1);
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int[] c={4,3,2,7,8,2,3,1};
        List<Integer> p=check(c);
        System.out.println(p);
    }
    
}
