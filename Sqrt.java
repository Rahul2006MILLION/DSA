public class Sqrt {
    public static void main(String[] args) {
        int x=8;
        int low=1,high=x;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int val=mid*mid;
            if(val<=x){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(ans);
    
    }
    }
