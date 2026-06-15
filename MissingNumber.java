import java.util.*;

public class MissingNumber {
    public static int check(int arr[]){
        int n=arr.length;
        int expected=n*(n+1)/2;
        int actual=0;
        for(int i=0;i<n;i++){
            actual+=arr[i];
        }
        int p=expected-actual;
        return p;
    }
    public static void main(String[] args) {
        int[] arr={0,2,3};
        int e=check(arr);
        System.out.println(e);
    }

    
}
