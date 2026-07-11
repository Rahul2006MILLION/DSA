import java.util.*;
public class Third_Maxinmum_Number {
    public static int check(int[] nums){
        HashSet<Integer> rem_duplicate=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            rem_duplicate.add(nums[i]);
        }
        if(rem_duplicate.size()>2){
            int i=0;
            int[] n=new int [rem_duplicate.size()];
            for(int num:rem_duplicate){
                n[i]=num;
                i+=1;
            }
            Arrays.sort(n);
            return n[n.length-3];
        }
        else if(rem_duplicate.size()<=2){
            int max=0;
            for(int y:rem_duplicate){
                if(y>max){
                    max=y;
                }
            }
            return max;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] numb={0,4,6,3,1}; //try [1,2] which gives 2
        int a=check(numb);
        System.out.println(a);
    }
    
}
