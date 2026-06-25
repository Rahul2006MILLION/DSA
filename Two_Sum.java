import java.util.*;

public class Two_Sum {
    public static int[] check(int[] l,int target){
        HashMap<Integer,Integer> d=new HashMap<>();

        for(int i=0;i<l.length;i++){
            int y=target-l[i];
            if(d.containsKey(y)){
                return new int[]{d.get(y),i};
            }
            d.put(l[i],i);
        }
        return new int[] {};

    }
    public static void main(String[] args) {
        int[] l={2,7,11,15};
        int target=9;
        int[] b=check(l, target);
        System.out.println(Arrays.toString(b));
    }
    
}
