import java.util.ArrayList;
import java.util.List;

public class Number_of_Good_Pairs {
    public static int check(int[] nums){
        List<int[]> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    l.add(new int[]{i,j});
                }
            }
        }
        int count=0;
        for(int[] p: l){
            count+=1;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,1,1,3};
        int g=check(a);
        System.err.println(g);
    }
    
}
