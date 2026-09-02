import java.util.HashMap;
import java.util.HashSet;

public class Isomorphic_Strings {
    public static boolean check(String s, String t){
        HashMap<Character,Character> d=new HashMap<>();
        HashSet<Character> seen=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!d.containsKey(s.charAt(i))){
                if(seen.contains(t.charAt(i))){
                    return false;
                }
                d.put(s.charAt(i),t.charAt(i));
                seen.add(t.charAt(i));
            }
            else{
                if(d.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String r="badc"; //try egg
        String y="baba"; //try add
        boolean k =check(r, y);
        System.out.println(k);

    }
    
}
