import java.util.*;
public class Harshad_Number {
    public static int check(int n){
        int a=n;
        int sum=0;
        List<Integer> l =new ArrayList<>();
        while(n>0){
            int r=n%10;
            l.add(r);
            n=n/10;
        }
        for(int i=0;i<l.size();i++){
            sum+=l.get(i);
        }
        if(a%sum==0){
            return sum;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a=18;
        int b=check(a);
        System.out.println(b);
    }
    
}
