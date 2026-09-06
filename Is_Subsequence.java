import java.util.ArrayList;
import java.util.List;

public class Is_Subsequence {
    public static boolean check(String s, String t){
        List<Character> l=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<s.length() & j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                l.add(s.charAt(i));
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(s.length()==l.size()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String w="aza";
        String e="ahzbza";
        boolean m=check(w, e);
        System.out.println(m);
    }
    
}
