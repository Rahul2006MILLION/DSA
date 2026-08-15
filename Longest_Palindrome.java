import java.util.HashMap;

public class Longest_Palindrome {
    public static int check(String s){
        int c=0;
        int flag=0;
        HashMap<Character,Integer> d=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!d.containsKey(s.charAt(i))){
                d.put(s.charAt(i),1);
            }
            else{
                d.put(s.charAt(i), d.get(s.charAt(i))+1);
            }
        }
        for(int num:d.values()){
            if(num%2==0){
                c+=num;
            }
            else{
                flag=1;
                c+=num-1;
            }
        }
        if(flag==1){
            c+=1;
        }
        return c;

    }
    public static void main(String[] args) {
        String c="abccccdd";
        int g=check(c);
        System.out.println(g);
    }
    
}
