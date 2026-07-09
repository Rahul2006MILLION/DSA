import java.util.Arrays;
import java.util.HashSet;

public class Intersection_of_Multiple_Arrays {
    public static int[] check(int[][] nums){
        HashSet<Integer> seen=new HashSet<>();
        for(int i=0;i<nums[0].length;i++){
            seen.add(nums[0][i]);
        }
        for(int i=1;i<nums.length;i++){
            HashSet<Integer> temp_seen=new HashSet<>();
            for(int j=0;j<nums[i].length;j++){
                if(seen.contains(nums[i][j])){
                    temp_seen.add(nums[i][j]);
                }
            }
            seen=temp_seen;
        }
        int[] a=new int[seen.size()];
        int g=0;
        for(int num:seen){
            a[g]=num;
            g+=1;
            
        }
        Arrays.sort(a); //For List<Integer> l=new ArrayList<>() use Collections.sort(a);
        return a;
    }
    public static void main(String[] args){
        int[][] s={{7,34,45,10,12,27,13},{27,21,45,10,12,13}};
        int[] x=check(s);
        System.out.println(Arrays.toString(x));
    }
    
}
