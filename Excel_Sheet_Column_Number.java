public class Excel_Sheet_Column_Number {
    public static void main(String[] args) {
        String a="XY";
        //works like X=24, Y=26 in alphabets
        //26^1 * 24 + 26^0 *25
        // 26 *24 + 1*25 =649
        // this pattern is forund in binary to ecimal conversion
        int res=0;
        for(int i=0;i<a.length();i++){
            int d= a.charAt(i) - 'A'+1;
            res=res*26+d;
        }
        System.out.println(res);
    }
    
}
