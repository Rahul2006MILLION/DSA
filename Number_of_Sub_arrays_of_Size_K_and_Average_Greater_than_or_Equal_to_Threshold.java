public class Number_of_Sub_arrays_of_Size_K_and_Average_Greater_than_or_Equal_to_Threshold {
    public static int check(int[] arr,int k,int threshold){
        int count=0;
        int curr=0;
        for(int i=0;i<k;i++){
            curr+=arr[i];
        }
        if(curr>=threshold*k){
            count+=1;
        }
        for(int i=k;i<arr.length;i++){
            curr=curr-arr[i-k]+arr[i];
            if(curr>=threshold*k){
                count+=1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] n={2,2,2,2,5,5,5,8};
        int y=3;
        int t=4;
        int h=check(n, y, t);
        System.out.println(h);
    }
}
