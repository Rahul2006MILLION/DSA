import java.util.ArrayList;
import java.util.List;

public class Largest_Number_at_least_twice_of_others {
    public static int check(int[] nums){
        List<Integer> l=new ArrayList<>();
        int flag=0;
        int max=nums[0];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max){
                l.add(2*nums[i]);
            }
        }
        for(int i=0;i<l.size();i++){
            if(l.get(i)<=max){
                flag=1;
            }
            else{
                return -1;
            }
        }
        if(flag==1){
            return index;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,20};
        int b=check(a);
        System.out.println(b);
    }
    
}
