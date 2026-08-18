import java.util.*;

public class Valid_Parenthesis {
    public static boolean check(String s){
        HashMap<Character,Character> d=new HashMap<>();
        d.put('}','{');
        d.put(']','[');
        d.put(')','(');
        List<Character> l=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(!d.containsKey(s.charAt(i))){
                l.add(s.charAt(i));
            }
            else{
                if(l.size()==0){
                    return false;
                }
                else{
                    char pop=l.remove(l.size()-1);
                    if(pop!=d.get(s.charAt(i))){
                        return false;
                    }
                }
            }
        }
        if(l.size()==0){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        String k="()[]{}"; //try {][]}
        boolean v=check(k);
        System.out.println(v);
    }
    
}
