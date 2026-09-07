public class Maximum_Average_Subarray_I {
    public static double check(int[] nums,int k){
        int max=0;
        int cur=0;
        for(int i=0;i<k;i++){
            cur+=nums[i];
        }
        max=cur;
        for(int i=k;i<nums.length;i++){
            cur=cur-nums[i-k]+nums[i];
            if(cur>max){
            max=cur;
            }
        }
        return (double) max / k;
    }
    public static void main(String[] args) {
        int[] p={1,12,-5,-6,50,3};
        int y=4;
        double g=check(p, y);
        System.out.println(g);
    }
    
}
