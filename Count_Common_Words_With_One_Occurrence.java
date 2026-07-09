import java.util.HashMap;

public class Count_Common_Words_With_One_Occurrence {
    public static int check(String[] a, String[] b){
        HashMap<String,Integer> d=new HashMap<>();
        HashMap<String,Integer> dd=new HashMap<>();
        int ans=0;
        for(int i=0;i<a.length;i++){
            if(!d.containsKey(a[i])){
                d.put(a[i],1);
            }
            else{
                d.put(a[i],d.get(a[i])+1);
            }
        }
        for(int i=0;i<b.length;i++){
            if(!dd.containsKey(b[i])){
                dd.put(b[i],1);
            }
            else{
                dd.put(b[i],dd.get(b[i])+1);
            }
        }
        for(String nums:d.keySet()){
            if(dd.containsKey(nums) && d.get(nums)==1 && dd.get(nums)==1){
                ans+=1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        String[] x={"leetcode","is","amazing","as","is"};
        String[] y={"amazing","leetcode","is"};
        int z=check(x, y);
        System.out.println(z);
    }
    
}
