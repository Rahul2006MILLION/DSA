public class Find_First_Palindromic_String_in_the_Array {
    public static String check(String[] words){
        for(int i=0;i<words.length;i++){
            String ne = words[i];
            String rev=new StringBuilder(ne).reverse().toString();
            if(ne.equals(rev)){
                return ne;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String[] a={"abc","car","ada","racecar","cool"};
        String h=check(a);
        System.out.println(h);
    }
    
}
