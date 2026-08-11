public class Find_Pivot_Index {
    public static int check(int[] nums){
        int total=0;
        int left_sum=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int right_sum=total;
        for(int i=0;i<nums.length;i++){
            right_sum-=nums[i];
            if(right_sum==left_sum){
                return i;
            }
            left_sum+=nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={1,7,3,6,5,6};
        int c=check(a);
        System.out.println(c);
    }
    
}
