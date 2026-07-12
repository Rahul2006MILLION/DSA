public class Max_consecutive_Ones {
    public static int check(int[] nums){
        int max_count=0;
        int cur_count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cur_count+=1;
                if(cur_count>max_count){
                    max_count=cur_count;
                }
            }
            else{
                cur_count=0;
            }
        }
        return max_count;
    }
    public static void main(String[] args) {
        int[] n={1,1,0,1,1,1};
        int a=check(n);
        System.out.println(a);
    }
    
}
