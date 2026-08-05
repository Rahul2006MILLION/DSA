public class Get_Maximum_in_Generated_Array {
    public static int check(int n){
        if(n==0){
            return 0;
        }
        int[] nums=new int[n+1];
        nums[0]=0;
        nums[1]=1;
        for(int i=0;i<nums.length+2;i++){
            if(2*i<=n){
                nums[2*i]=nums[i];
            }
            if(2*i+1<=n){
                nums[2*i+1]=nums[i]+nums[i+1];
            }
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int num=7;
        int b=check(num);
        System.out.println(b);
    }
    
}
