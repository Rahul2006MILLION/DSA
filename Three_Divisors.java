import java.util.ArrayList;
import java.util.List;

public class Three_Divisors {
    public static boolean check(int n){
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                l.add(i);
            }
        }
        if(l.size()==3){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n=4;
        boolean c=check(n);
        System.out.println(c);
    }
    
}
