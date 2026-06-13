public class Fibonacci_Number {
    public static int check(int n){
        if(n<=0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        int[] a=new int[n+1];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<=n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[a.length-1];
    }
    public static void main(String[] args) {
        int n=4;
        int b=check(n);
        System.out.println(b);
    }
    
}
