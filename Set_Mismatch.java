import java.util.*;

public class Set_Mismatch {
    public static int[] check(int[] nums){
        HashMap<Integer,Integer> d=new HashMap<>();
        HashSet<Integer>seen=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(!d.containsKey(nums[i])){
                d.put(nums[i], 1);
                seen.add(nums[i]);
            }
            else{
                d.put(nums[i],d.get(nums[i])+1);
            }
        }
        int duplicate=0;
        for(int key:d.keySet()){
            if(d.get(key)>1){
                duplicate=key;
            }
        }
        int[] arr=new int[seen.size()];
        int i=0;
        for(int num: d.keySet()){
            arr[i]=num;
            i+=1;
        }
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
        }
        int n=nums.length;
        int expected=n*(n+1)/2;
        int res=expected-sum;
        return new int[] {duplicate,res};
    }
    public static void main(String[] args){
        int[] n={1,2,2,4}; // check for {1,1} give [1,2] :)
        int[] a=check(n);
        System.out.println(Arrays.toString(a));
    }
    
}
