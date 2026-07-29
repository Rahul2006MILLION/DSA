import java.util.ArrayList;
import java.util.HashSet;

public class Unique_Email_Address {
    public static int check(String[] emails){
        HashSet<String> seen=new HashSet<>();
        for(String email:emails){
            String[] parts=email.split("@");
            String local=parts[0];
            String domain=parts[1];

            ArrayList<Character> l=new ArrayList<>();
            for(int i=0;i<local.length();i++){
                char ch=local.charAt(i);
                if(ch=='.'){
                    continue;
                }
                else if(ch=='+'){
                    break;
                }
                l.add(ch);
            }
            String res="";
            for(char ch:l){
                res+=ch;
            }
            seen.add(res+"@"+domain);

        }
        return seen.size();

    }
    public static void main(String[] args) {
        String[] e={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        int b=check(e);
        System.out.println(b);
    }
    
}
