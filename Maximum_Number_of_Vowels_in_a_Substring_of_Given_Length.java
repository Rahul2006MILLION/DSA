import java.util.*;

public class Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {
    public static int check(String s,int k){
    
        int max=0;
        int cur=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                cur++;
            }

        }
        max=cur;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                cur++;
            }
            if(isVowel(s.charAt(i-k))){
                cur--;
            }
            if(cur>max){
                max=cur;
            }
        }
        return max;

    }
    private static boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static void main(String[] args) {
        String x="abciiidef";
        int j=3;
        int v=check(x, j);
        System.out.println(v);
    }
    
}
