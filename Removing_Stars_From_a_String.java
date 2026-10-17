import java.util.Stack;

public class Removing_Stars_From_a_String {
    public static String check(String s){
        int i=0;
        Stack<Character> stk=new Stack<>();
        while(i<s.length()){
            if(!stk.isEmpty() && s.charAt(i)=='*'){
                stk.pop();
            }
            else{
                stk.add(s.charAt(i));
            }
            i+=1;
        }
        StringBuilder l=new StringBuilder();
        for(char f:stk){
            l.append(f);
        }
        return l.toString();
    }
    public static void main(String[] args) {
        String u = "leet**cod*e";
        String g=check(u);
        System.out.println(g);
    }
    
}
