public class Longest_Repeating_Character_Replacement {

    public static int check(String s,int k){
        int left=0;
        int longest=0;
        int[] l=new int[26];
        for(int right=0;right<s.length();right++){
            l[s.charAt(right)-'A']+=1;
            int max=0;
            for(int n:l){
                max=Math.max(max, n);
            }
            while((right-left+1)-max>k){
                l[s.charAt(left)-'A']-=1;
                left+=1;
            }
            longest=Math.max((right-left+1), longest);
        }
        return longest;
    }
    public static void main(String[] args) {
        String u="AABABBA";
        int h=1;
        int g=check(u, h);
        System.out.println(g);
    }
    
}
