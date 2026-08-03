public class Longest_Continious_Increasing_Subsequence {
    public static int check(int[] nums){
        int best=1;
        int curr=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                curr++;
                if(curr>best){
                    best=curr;
                }
            }
            else{
                curr=1;
            }
        }
        return best;
    }
    public static void main(String[] args) {
        int[] a={1,3,5,7,2};
        int b=check(a);
        System.out.println(b);
    }
    
}
