import java.util.*;
public class romanNumbers {
    public static int check(String e){
        HashMap<Character,Integer> d=new HashMap<>();
        d.put('I', 1);
        d.put('V', 5);
        d.put('X', 10);
        d.put('L', 50);
        d.put('C', 100);
        d.put('D', 500);
        d.put('M', 1000);
        int ans=0;
        int n=e.length();
        for(int i=0;i<n-1;i++){
            int cur=d.get(e.charAt(i));
            int nxt=d.get(e.charAt(i+1));
            if(cur<nxt){
                ans-=cur;
            }
            else{
                ans+=cur;
            }
        }
        ans+=d.get(e.charAt(n-1));
        return ans;

    }

    public static void main(String[] args) {
        String e="XIV";
        int a=check(e);
        System.out.println(a);
    }
}
