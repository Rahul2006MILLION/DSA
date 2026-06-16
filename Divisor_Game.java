public class Divisor_Game {
    public static boolean check(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int a=5;
        boolean b=check(a);
        System.out.println(b);
    }
    
}
