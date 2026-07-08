import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Intersection_of_Two_Arrays_II {
    public static int[] check(int[] num1,int[] num2){
        HashMap<Integer,Integer> d=new HashMap<>();
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<num1.length;i++){
            if(!d.containsKey(num1[i])){
                d.put(num1[i], 1);
            }
            else{
                d.put(num1[i], d.get(num1[i])+1);
            }
        }
        for(int i=0;i<num2.length;i++){
            if(d.containsKey(num2[i]) && d.get(num2[i])>0){
                arr.add(num2[i]);
                d.put(num2[i], d.get(num2[i]) - 1);
            }
        }
        int[] a=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            a[i]=arr.get(i);
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a={4,9,5};
        int[] b={9,4,9,8,4};
        int[] c=check(a, b);
        System.out.println(Arrays.toString(c));
    }
    
}
