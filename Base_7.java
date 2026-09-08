import java.util.*;

public class Base_7 {
    public static String check(int n){
        int a=n;
        ArrayList<Integer> l= new ArrayList<>();
        if(n==0){
            return "0";
        }
        n=Math.abs(n);
        while(n>0){
            int r=n%7;
            n=n/7;
            l.add(r);
        }
        Collections.reverse(l);
        String s="";
        for(int x:l){
            s+=x;
        }
        if(a<0){
            return '-'+s;
        }
        return s;
    }
    public static void main(String[] args) {
        int o= -10;
        String x=check(o);
        System.out.println(x);
    }
    
}
