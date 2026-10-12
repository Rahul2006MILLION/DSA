import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_In_String {
    public static String check(String s){
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stk.isEmpty() && s.charAt(i)==stk.peek()){
                stk.pop();
            }
            else{
                stk.push(s.charAt(i));
            }
        }
        StringBuilder res=new StringBuilder();
        for(char c:stk){
            res.append(c);
        }
        return res.toString();

    }
    public static void main(String[] args) {
        System.out.println(check("abbaca"));
    }
    
}
