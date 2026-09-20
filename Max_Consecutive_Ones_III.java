public class Max_Consecutive_Ones_III {
    public static int check(int[] nums,int k){
        int left=0;
        int max=0;
        int zero_count=0;
        int right=0;
        int w=0;
        for(right=0;right<nums.length;right++){
            if(nums[right]==0){
                zero_count+=1;
            }
            while(zero_count>k){
                if(nums[left]==0){
                    zero_count-=1;
                }
                left++;
            }
            w= right-left+1;
            max=Math.max(max, w);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] p={1,1,1,0,0,0,1,1,1,1,0};
        int y=2;
        int t=check(p, y);
        System.out.println(t);
    }
    
}
