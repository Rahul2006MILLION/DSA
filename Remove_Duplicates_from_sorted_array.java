public class Remove_Duplicates_from_sorted_array {
    public static int check(int[] nums){
        //[1,1,2,2,3]
        int write=0;
        for(int read=0;read<nums.length;read++){
            if(nums[write]!=nums[read]){
                write+=1;
                nums[write]=nums[read];
            }
        }
        return write+1;
    }
    public static void main(String[] args) {
        int[] a={1,1,2};
        int b=check(a);
        System.out.println(b);
    }
}
