public class Find_the_Original_Typed_String_I {
    public static int check(String word){
        int sum=1;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==word.charAt(i-1)){
                sum++;
            }
        }
        return sum;
    }    
    public static void main(String[] args) {
        String j="abbcccc";
        int y=check(j);
        System.out.println(y);
    }
}
