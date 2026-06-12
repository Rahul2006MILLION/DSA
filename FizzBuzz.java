import java.util.*;
public class FizzBuzz {
    public static List check(int n){
        List<String> l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                l.add("FizzBuzz");
                continue;
            }
            else if(i%3==0){
                l.add("Fizz");
                continue;
            }
            else if(i%5==0){
                l.add("Buzz");
                continue;
            }
            l.add(String.valueOf(i));
        }
        return l;
    }
    public static void main(String[] args){
        int n=15;
        List b=check(n);
        System.out.println(b);
    }
    
}
