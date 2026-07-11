import java.util.ArrayList;
import java.util.List;

public class Niether_Minimum_Nor_Maximum {
    public static int check(int[] nums){
        int max=nums[0];
        int min=nums[0];
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max && nums[i]!=min){
                arr.add(nums[i]);
            }
        }
        if(arr.size()==0){
            return -1;
        }
        int minn=arr.get(0);
        for(int num:arr){
            if(num<minn){
                minn=num;
            }
        }
        return minn;


    }
    public static void main(String[] args){
        int[] a={3,2,4,1}; //try {1,2} will get -1 :)
        int b=check(a);
        System.out.println(b);
    }
    
}
