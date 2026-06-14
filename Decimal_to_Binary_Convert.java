import java.util.*;
public class Decimal_to_Binary_Convert {
    public static void main(String[] args) {
        int n=17;
        List<Integer> l= new ArrayList<>();
        while(n>0){
            int r=n%2;
            l.add(r);
            n=n/2;
        }
        Collections.reverse(l);
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i));
        }
    }
    
}
