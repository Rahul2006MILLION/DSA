public class Longest_Subarray_of_1s_After_Deleting_One_Element {

    public static int check(int[] nums){
        int k=1;
        int left=0;
        int maxzero_count=0;
        int max_count=0;
        int right=0;
        for(right=0;right<nums.length;right++){
            if(nums[right]==0){
                maxzero_count+=1;
            }
            while(maxzero_count>k){
                if(nums[left]==0){
                    maxzero_count-=1;
                }
                left++;
            }
            int w=right-left;
            max_count=Math.max(max_count, w);
        }
        return max_count;
    }
    public static void main(String[] args) {
        int[] j={0,1,1,1,0,1,1,0,1};
        int r=check(j);
        System.out.println(r);
    }
    
}
