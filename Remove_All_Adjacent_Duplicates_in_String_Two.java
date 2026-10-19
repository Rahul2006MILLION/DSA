import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_in_String_Two {

    public static String check(String s,int k){
        Stack<char[]> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && stack.peek()[0]==s.charAt(i)){
                stack.peek()[1]+=1;
            }
            else{
                stack.add(new char[]{s.charAt(i),1});
            }
            if(stack.peek()[1]==k){
                stack.pop();
            }
        }
        StringBuilder l=new StringBuilder();
        for(char[] p: stack){
            for(int i=0;i<p[1];i++){
                l.append(p[0]);
            }
            
        }
        return l.toString();
    }
    public static void main(String[] args) {
        String o="deeedbbcccbdaa";
        int t=3;
        String x=check(o, t);
        System.out.println(x);
    }
    
}
