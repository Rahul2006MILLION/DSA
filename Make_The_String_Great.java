import java.util.Stack;

public class Make_The_String_Great {
    public static String check(String s){
        Stack<Character> stk=new Stack<>();
        int i=0;
        while(i<s.length()){
            if(!stk.isEmpty() && stk.peek()!=s.charAt(i) && Character.toLowerCase(stk.peek()) == Character.toLowerCase(s.charAt(i))){
                stk.pop();
            }
            else{
                stk.add(s.charAt(i));
            }
            i+=1;
        }
        StringBuilder l = new StringBuilder();
        for(char c:stk){
            l.append(c);
        }
        return l.toString();
    }
    public static void main(String[] args) {
        System.out.println(check("leEeetcode"));
    }
    
}
