import java.util.*;

public class Happy_Number {
    public static boolean check(int n){
        HashSet<Integer> seen=new HashSet<>();
        while(n!=1 && !seen.contains(n) ){
            List<Integer> l=new ArrayList<>();
            seen.add(n);
            while(n>0){
                int r=n%10;
                l.add(r*r);
                n=n/10;

            }
            int sum=0;
            for(int i=0;i<l.size();i++){
                sum+=l.get(i);

            }
            n=sum;
        }
        return n==1;
    }
    public static void main(String[] args) {
        int n=2;
        boolean b=check(n);
        System.out.println(b);
    }
    
}
