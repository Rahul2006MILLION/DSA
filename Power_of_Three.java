public class Power_of_Three {
    public static boolean check(int n){
        if(n<=0){
            return false;
        }
        while(n>1){
            if(n%3!=0){
                return false;
            }
            n=n/3;
        }
        return n==1;
    }
    public static void main(String[] args) {
        int a=18;
        boolean b=check(a);
        System.out.println(b);
    }
    
}
