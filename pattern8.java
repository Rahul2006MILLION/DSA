public class pattern8 {
    public static void main(String[] args) {
        int n=4;
        for(int i=n;i>=1;i--){
            for(int k=0;k<n-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
