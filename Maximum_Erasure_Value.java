import java.util.HashSet;

public class Maximum_Erasure_Value {
    public static int check(int[] nums){
        int left=0;
        int sum=0;
        int maxsum=0;
        HashSet<Integer> seen=new HashSet<>();
        for(int right=0;right<nums.length;right++){
            while(seen.contains(nums[right])){
                seen.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            sum+=nums[right];
            seen.add(nums[right]);
            maxsum=Math.max(maxsum, sum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] h={5,2,1,2,5,2,1,2,5};
        int d=check(h);
        System.out.println(d);
    }
    
}
