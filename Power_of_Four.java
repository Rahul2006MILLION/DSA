public class Power_of_Four {
    public static boolean check(int n){
        if(n<=0){
            return false;
        }
        while(n>1){
            if(n%4!=0){
                return false;
            }
            n=n/4;
        }
        return n==1;
    }
    public static void main(String[] args) {
        int a=256; //Enter number 12 i gives 4 cause it is not power of 4
        boolean b=check(a);
        System.out.println(b);
    }
    
}
