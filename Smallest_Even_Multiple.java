public class Smallest_Even_Multiple {
    public static int check(int n){
        if(n%2==0){
            return n;
        }
        else{
            return n*2;
        }
    }
    public static void main(String[] args) {
        int a= 6;
        int c=check(a);
        System.out.println(c);
    }
    
}
