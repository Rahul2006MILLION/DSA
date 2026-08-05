import java.util.HashMap;

public class Sum_of_Unique_Elements {
    public static int check(int[] nums){
        HashMap<Integer,Integer> d=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!d.containsKey(nums[i])){
                d.put(nums[i], 1);
            }
            else{
                d.put(nums[i],d.get(nums[i])+1);
            }
        }
        int sum=0;
        for(int num: d.keySet()){
            if(d.get(num)==1){
                sum+=num;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] u={1,2,3,3,4};
        int s=check(u);
        System.out.println(s);
    }
    
}
