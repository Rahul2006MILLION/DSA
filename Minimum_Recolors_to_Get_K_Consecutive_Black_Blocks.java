public class Minimum_Recolors_to_Get_K_Consecutive_Black_Blocks {
    public static int check(String s, int k){
        int min_count=0;
        int least_count=0;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='W'){
                min_count+=1;
            }
        }
        least_count=min_count;
        for(int i=k;i<s.length();i++){
            if(s.charAt(i-k)=='W'){
                min_count-=1;
            }
            if(s.charAt(i)=='W'){
                min_count+=1;
            }
            if(min_count<least_count){
                least_count=min_count;
            }
        }
        return least_count;
    }
    public static void main(String[] args) {
        String d="WBBWWBBWBW";
        int u=7;
        int v=check(d, u);
        System.out.println(v);
    }
    
}
