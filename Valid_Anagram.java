import java.util.HashMap;

public class Valid_Anagram {
    public static boolean check(String s,String t){
        HashMap<Character,Integer> ds=new HashMap<>();
        HashMap<Character,Integer> dt=new HashMap<>();
        int flag=0;
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(!ds.containsKey(s.charAt(i))){
                ds.put(s.charAt(i), 1);
            }
            else{
                ds.put(s.charAt(i),ds.get(s.charAt(i))+1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(!dt.containsKey(t.charAt(i))){
                dt.put(t.charAt(i),1);
            }
            else{
                dt.put(t.charAt(i),dt.get(t.charAt(i))+1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(!dt.containsKey(s.charAt(i))){
                return false;
            }
        }
        for(int i=0;i<s.length();i++){
            if(!ds.get(s.charAt(i)).equals(dt.get(s.charAt(i)))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a="abb"; 
        String b="abc"; //try (raj jar) or (racecar and carrace) :)
        boolean m=check(a, b);
        System.out.println(m);
    }
    
}
