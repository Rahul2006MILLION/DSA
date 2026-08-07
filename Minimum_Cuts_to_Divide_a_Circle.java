public class Minimum_Cuts_to_Divide_a_Circle {
    public static int check(int n){
        if(n==1){
            return 0;
        }
        if(n%2==0){
            return n/2;
        }
        else{
            return n;
        }
    }
    public static void main(String[] args) {
        int f=4;
        int r=check(f);
        System.out.println(r);
    }
}
