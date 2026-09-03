import java.util.*;

public class Faulty_Keyboard {
    public static String check(String s){
        char[] arr= s.toCharArray();
        List<Character> l = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='i'){
                Collections.reverse(l);
            }
            else{
                l.add(arr[i]);
            }
        }
        StringBuilder ans = new StringBuilder();
        for (char c : l) {
            ans.append(c);
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "string";
        String h=check(s);
        System.out.println(h);
    }
    
}
