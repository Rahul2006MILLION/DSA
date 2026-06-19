public class Valid_Perfect_Square {
    public static boolean check(int n){
        long low=1;
        long high=n;
        while(low<=high){
            long mid=(low+high)/2;
            if(mid*mid==n){
                return true;
            }
            else if(mid*mid<n){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a=49;
        boolean b=check(a);
        System.out.println(b); 
    }
    
}
//for(int i=0;i<=n;i++){
//  if(i*i==n){ return true}
// return false }
//This also works but takes a lot of time as it need to traverse from number 1 to n
// If n is bigger value ten it takes a lot of time to give the valid output
//So we use Binary Search where most of the numbers get eliminated and thus giving a valid
//output in less time complexity!