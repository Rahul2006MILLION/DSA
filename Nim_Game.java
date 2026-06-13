public class Nim_Game {
    public static boolean check(int n){
        if(n%4==0){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        int n=5;
        boolean a=check(n);
        System.out.println(a);
    }
    
}
