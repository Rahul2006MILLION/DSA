public class pattern10 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k=1;k<n+1;k++){
            for(int l=n+1;l>k+1;l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
