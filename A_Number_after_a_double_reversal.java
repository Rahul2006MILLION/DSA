public class A_Number_after_a_double_reversal {
    public static boolean check(int num){
        if(num==0){
            return true;
        }
        else if(num%10==0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int d=12008;
        boolean c=check(d);
        System.out.println(c);
    }
    
}
