public class Consecutive_Characters {
    public static int check(String s){
        int max_count=1;
        int cur_count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cur_count+=1;
                if(cur_count>max_count){
                    max_count=cur_count;
                }
            }
            else{
                cur_count=1;
            }
        }
        return max_count;
    }
    public static void main(String[] args){
        String a="abbcccddddeeeeedcba";
        int e=check(a);
        System.out.println(e);

    }
    
}
