import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {
    public static int check(String s){
        if(s.length()==0){
            return 0;
        }
        int left=0;
        int longest=0;
        HashSet<Character> seen=new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }
            longest=Math.max(longest, (right-left)+1);
            seen.add(s.charAt(right));
        }
        return longest;
    }
    public static void main(String[] args) {
        String x="pwwkew";
        int c=check(x);
        System.out.println(c);
    }
    
}
