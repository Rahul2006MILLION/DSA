public class Reverse_Integer {
    public static int check(int x){
        int a=x;
        long sign;
        long rev=0;
        if(x<0){
            sign=-1;
        }
        else{
            sign=1;
        }
        x=Math.abs(x);
        while(x>0){
            int r=x%10;
            x=x/10;
            rev=rev*10+r;
        }
        if(rev > 2147483647 || rev < -2147483648){
            return 0;
        }
        return (int)(sign*rev);
    }
    public static void main(String[] args) {
        int x=-120;
        int b=check(x);
        System.out.println(b);
    }
}
