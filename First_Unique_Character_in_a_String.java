import java.util.HashMap;

public class First_Unique_Character_in_a_String {
    public static int check(String s){
        HashMap<Character,Integer> d=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!d.containsKey(c)){
                d.put(c,1);
            }
            else{
                d.put(c,d.get(c)+1);
            }
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(d.get(c)==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String a="leetcode";
        int v=check(a);
        System.out.println(v);
    }
    
}
