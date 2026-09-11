public class Pow_x_and_n {
    public static double check(double x, int n){
        double a=Math.pow(x, n);
        return a;
    }
    public static void main(String[] args) {
        double f=2.10000;
        int n=3;
        double o=check(f, n);
        System.out.println(o);
    }
    
}
