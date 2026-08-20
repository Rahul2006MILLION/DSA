import java.util.HashMap;

public class Find_Difference {
    public static char check(String s,String t){
        HashMap<Character,Integer> d=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!d.containsKey(s.charAt(i))){
                d.put(s.charAt(i),1);
            }
            else{
                d.put(s.charAt(i), d.get(s.charAt(i))+1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(d.containsKey(t.charAt(i))){
                d.put(t.charAt(i),d.get(t.charAt(i))-1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(!d.containsKey(t.charAt(i))){
                return t.charAt(i);
            }
        }
        for(char r:d.keySet()){
            if(d.get(r)<0){
                return r;
            }
        }
        return ' ';
    }
    public static void main(String[] args) {
        String p="a";
        String d="aa";
        char x=check(p, d);
        System.out.println(x);
    }
    
}
