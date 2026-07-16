public class Longer_Contiguous_Segments_of_Ones_than_Zeros {
    public static boolean check(String s){
        int cur0=0;
        int cur1=0;
        int max0=0;
        int max1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                cur1+=1;
                if(cur1>max1){
                    max1=cur1;
                }
            }
            else{
                cur1=0;
            }
            if(s.charAt(i)=='0'){
                cur0+=1;
                if(cur0>max0){
                    max0=cur0;
                }
            }
            else{
                cur0=0;
            }

        }
        return max1>max0;
    }
    public static void main(String[] args) {
        String a="1101000111110"; //110100010 try this :)
        boolean b=check(a);
        System.out.println(b);
    }
    
}
