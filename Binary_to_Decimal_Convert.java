import java.util.*;
public class Binary_to_Decimal_Convert {
    public static int check(String a){
        int res=0;
        for(int i=0;i<a.length();i++){
            int d = a.charAt(i)-'0';
            res=res*2+d;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Binary Number: ");
        String n=sc.nextLine();
        int s= check(n);
        System.out.println("After Conversion: ");
        System.out.println(s);
    }
    
}
