import java.util.*;
public class Add_Digits {
    public static int check(int n){
        while(n>=10){
            List<Integer>l=new ArrayList<>();
            while(n>0){
                int r=n%10;
                l.add(r);
                n=n/10;
            }
            int sum=0;
            for(int i=0;i<l.size();i++){
                sum+=l.get(i);
            }
            n=sum;
        }
        return n;
    }
    public static void main(String[] args) {
        int a=38;
        int b=check(a);
        System.out.println(b);
    }
    
}
