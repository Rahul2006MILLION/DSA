import java.util.*;
public class Excel_Sheet_Column_Title {
    public static String check(int n){
        List<Character> l=new ArrayList<>();
        while(n>0){
            n=n-1;
            int r=n%26;
            char d=(char)('A'+r);
            l.add(d);
            n=n/26;

        }   
        Collections.reverse(l);
        StringBuilder sb = new StringBuilder();
        for(char ch : l){
        sb.append(ch);
        }

    return sb.toString();
}
public static void main(String[] args) {
    int n=28;
    String a=check(n);
    System.out.println(a);
}
    

    
}
