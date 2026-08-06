import java.util.*;

public class Min_Cost_Climbing_Stairs {
    public static int check(int[] cost){
        //[10,15,20]0
        int arr[]=new int[cost.length+1];
        for(int i=0;i<cost.length;i++){
            arr[i]=cost[i];
        }
        arr[arr.length-1]=0;

        for(int i=arr.length-3;i>-1;i--){
            arr[i]=Math.min(arr[i]+arr[i+1],arr[i]+arr[i+2]);
        }
        return Math.min(arr[0],arr[1]);
    }
    public static void main(String[] args) {
        int[] a={10,15,20}; //try this {1,100,1,1,1,100,1,1,100,1} :)
        int b=check(a);
        System.out.println(b);
    }
}
