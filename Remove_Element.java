public class Remove_Element {
    public static int check(int[] nums,int val){
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k+=1;
            }
        }
        return k;
    }
    public static void main(String[] args){
        int[] l={0,1,2,2,3,0,4,2};
        int val=2;
        int a=check(l, val);
        System.out.println(a);
    }
    
}
