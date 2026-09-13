import java.util.HashMap;

public class Fruit_into_Basket {
    public static int check(int[] fruits){
        int left=0;
        int total=0;
        int res=0;
        HashMap<Integer,Integer> d=new HashMap<>();
        for(int right=0;right<fruits.length;right++){
            if(!d.containsKey(fruits[right])){
                d.put(fruits[right], 1);
            }
            else{
                d.put(fruits[right],d.get(fruits[right])+1);
            }
            while(d.size()>2){
                d.put(fruits[left], d.get(fruits[left]) - 1);
                if(d.get(fruits[left])==0){
                    d.remove(fruits[left]);
                }
                left++;
            }
            int a=right-left+1;
            res=Math.max(res, a);
        }
        return res;
        
    }
    public static void main(String[] args) {
        int[] p={1,2,3,2,2};
        int f=check(p);
        System.out.println(f);
    }
    

}
