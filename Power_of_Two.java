public class Power_of_Two {
    public static boolean check(int n){
        if(n<=0){
            return false;
        }
        while(n>1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }
        return true;
    }
    public static void main(String[] args) {
        int a=1;
        boolean b= check(a);
        System.out.println(b);
    }
}
