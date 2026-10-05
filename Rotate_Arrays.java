import java.util.Arrays;

public class Rotate_Arrays {
    public static int[] check(int[] nums,int k){
        int n=nums.length;
        k=k%n;
        int left=0;
        int right=n-1;
        int temp=0;
        while(left<right){
            temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left+=1;
            right-=1;
        }
        left=0;
        right=k-1;
        while(left<right){
            temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left+=1;
            right-=1;
        }
        left=k;
        right=n-1;
        while(left<right){
            temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left+=1;
            right-=1;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] g={1,2,3,4,5,6,7};
        int h=3;
        int[] u=check(g, h);
        System.out.println(Arrays.toString(u));
    }
    
}
