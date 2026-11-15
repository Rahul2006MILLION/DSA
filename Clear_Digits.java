import java.util.*;

public class Clear_Digits {
    public static String check(String s){
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                if(!stk.isEmpty()){
                    stk.pop();
                }
            }
            else{
                stk.add(s.charAt(i));
            }  
        }
        StringBuilder ans=new StringBuilder();
        for(char c: stk){
            ans.append(c);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String x="cb34";
        String b=check(x);
        System.out.println(b);
    }
    
}
