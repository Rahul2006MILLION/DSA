public class Valid_Palindrome {
    public static boolean check(String s){
        s = s.toLowerCase();
        String x= "";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                x+=s.charAt(i);
            }
        }
        String rev = new StringBuilder(x).reverse().toString();
        if(x.equals(rev)){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        String v="A man, a plan, a canal: Panama";
        boolean b=check(v);
        System.out.println(b);
    }
    
}
