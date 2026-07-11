import java.util.HashMap;

public class Contains_Duplicate_II {
    public static boolean check(int[] nums, int k){
        HashMap<Integer,Integer> d=new HashMap<>();
        int a;
        for(int i=0;i<nums.length;i++){
            if(!d.containsKey(nums[i])){
                d.put(nums[i],i);
            }
            else if(d.containsKey(nums[i])){
                a=i-d.get(nums[i]);
                if(a<=k){
                    return true;
                }
                else{
                    d.put(nums[i], i);
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] n={1,2,3,1,2,3}; //Try {1,0,1,1} k=1
        int k=2;
        boolean a=check(n, k);
        System.out.println(a);
    }
    
}
