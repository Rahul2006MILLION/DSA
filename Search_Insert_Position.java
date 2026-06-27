public class Search_Insert_Position {
    public static int check(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args){
        int[] a={1,3,5,7};
        int t=2; //check for the existing target number in the list, will return position of that num :)
        int b=check(a, t);
        System.out.println(b);
    }
}
