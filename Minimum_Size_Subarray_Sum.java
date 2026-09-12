public class Minimum_Size_Subarray_Sum {
    public static int check(int[] nums,int target){
        int left=0;
        int min_len=nums.length+1;
        int sum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                int a=right-left+1;
                min_len=Math.min(min_len, a);
                sum-=nums[left];
                left++;
            }
        }
        if(min_len==nums.length+1){
            return 0;
        }
        return min_len;
    }
    public static void main(String[] args) {
        int[] n={2,3,1,2,4,3}; //1,1,1,1,1,1,1,1]
        int t=7;
        int y=check(n, t);
        System.out.println(y);
    }
    
}
