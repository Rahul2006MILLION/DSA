import java.util.*;
import java.util.List;

public class Range_Sum_Query_Immutable {
    public static int check(int[] nums,int left,int right){
        int sum=0;
        int[] a=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            a[i]=sum;
        }
        if(left==0){
            return a[right];
        }
        else{
            int ans=a[right]-a[left-1];
            return ans;
        }
    }
    public static void main(String[] args) {
        int[] d={-2, 0, 3, -5, 2, -1};
        int lef=0;
        int rig=5;
        int s=check(d, lef, rig);
        System.out.println(s);
    }

    
}
