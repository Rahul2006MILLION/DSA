import java.util.Arrays;

public class Squares_of_Sorted_Array {
    public static int[] check(int[] nums){
        int[] a=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            a[i]=nums[i]*nums[i];
        }
        Arrays.sort(a);

    return a;
    }
    public static void main(String[] args) {
        int[] b={-4,-1,0,3,10};
        int[] c=check(b);
        System.out.println(Arrays.toString(c));
    }
    
    
}

