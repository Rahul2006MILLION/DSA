import java.util.*;

public class Find_Lucky_Number_in_Array {
    public static int check(int[] nums){
        HashMap<Integer,Integer> d=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        int flag=0;
        for(int i=0;i<nums.length;i++){
            if(!d.containsKey(nums[i])){
                d.put(nums[i], 1);

            }
            else{
                d.put(nums[i],d.get(nums[i])+1);
            }
        }
        for(int key: d.keySet()){
            if(key==d.get(key)){
                flag=1;
                l.add(key);
            }
        }
        int max=0;
        for(int i=0;i<l.size();i++){
            if(l.get(i)>max){
                max=l.get(i);
            }
        }
        if(flag==1){
            return max;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={1,2,2,2,3,3,3};
        int s=check(a);
        System.out.println(s);
    }
    
}
