public class Find_Greatest_Common_Divisor_of_an_Array {
    public static int check(int[] nums){
        int max=nums[0];
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        while(max>0 && min>0){
            if(max>min){
                max=max%min;
            }
            else{
                min=min%max;
            }
        }
        if(max==0){
            return min;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a={2,5,6,9,10};
        int d=check(a);
        System.out.println(d);
    }
    
}
