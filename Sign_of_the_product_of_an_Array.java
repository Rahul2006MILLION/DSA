public class Sign_of_the_product_of_an_Array {
    public static int check(int[] n){
        int negck=0;
        for(int i=0;i<n.length;i++){
            if(n[i]==0){
                return 0;
            }
            else if(n[i]<0){
                negck+=1;
            }
        }
        if(negck%2==0){
            return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={-1,-2,-3,-4,3,2,1};
        int b=check(arr);
        System.out.println(b);
    }
}
