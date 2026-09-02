import java.util.HashMap;
import java.util.HashSet;

public class Word_Pattern {
    public static boolean check(String pattern, String s){
        String[] words=s.split(" ");
        HashMap<Character,String> d=new HashMap<>();
        HashSet<String> seen=new HashSet<>();
        if(pattern.length()!=words.length){
            return false;
        }
        for(int i=0;i<words.length;i++){
            if(!d.containsKey(pattern.charAt(i))){
                if(seen.contains(words[i])){
                    return false;
                }
                d.put(pattern.charAt(i),words[i]);
                seen.add(words[i]);
            }
            else{
                if(!d.get(pattern.charAt(i)).equals(words[i])){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern="abba";
        String s="dog cat cat dog";
        boolean d=check(pattern, s);
        System.out.println(d);
    }
    
}
