import java.util.Arrays;

public class Convert_the_Temperature {
    public static double[] check(double celsius){
        double[] arr=new double[2];
        double k=celsius + 273.15;
        double fh=celsius * 1.80 + 32.00;
        arr[0]=k;
        arr[1]=fh;
        return arr;
    }
    public static void main(String[] args) {
        double a=36.50;
        double[] b=check(a);
        System.out.println(Arrays.toString(b));
    }
    
}
