public class Maximum_Difference_Between_Increasing_Elements {
    public static int check(int[] nums){
        int max=0;
        int start=nums[0];
        for(int i=0;i<nums.length;i++){
            int cur=0;
            if(nums[i]<start){
                start=nums[i];
            }
            else{
                cur=nums[i]-start;
                if(cur>max){
                    max=cur;
                }
            }
        }
        if(max==0){
            return -1;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a={87, 68, 91, 86, 58, 63, 43, 98, 6, 40};
        int c=check(a);
        System.out.println(c);
    }
    
}
