import java.util.Arrays;

public class Merge_Sorted_Array {
    public static int[] check(int[] nums1,int m, int[] nums2,int n){
        int x=m-1;
        int y=n-1;
        int z=m+n-1;
        while(y>=0){
            if(x>=0 && nums1[x]>=nums2[y]){
                nums1[z]=nums1[x];
                x-=1;
            }
            else{
                nums1[z]=nums2[y];
                y-=1;
            }
            z-=1;
        }
        return nums1;
    }
    public static void main(String[] args) {
        int[] n1={1,2,3,0,0,0};
        int m=3;
        int[] n2={2,5,6};
        int n=3;
        int[] n3=check(n1, m, n2, n);
        System.out.println(Arrays.toString(n3));
    }
    
}
