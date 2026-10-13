import java.util.*;
public class Backspace_String_Compare {
    public static String build(String s){
        StringBuilder l=new StringBuilder();
        int hash=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#'){
                hash+=1;
            }
            else if(hash>0){
                hash-=1;
            }
            else{
                l.append(s.charAt(i));
            }
        }
        return l.reverse().toString();

    }
    public static Boolean check(String s,String t){
        return build(s).equals(build(t));
    }
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(check(s, t));
    }
    
}
