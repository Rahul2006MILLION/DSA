public class Nth_Tribonacci_Number {
    public static int check(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else if(n==2){
            return 1;
        }
        int arr[]=new int[n];
        arr[0]=0;
        arr[1]=1;
        arr[2]=1;
        for(int i=3;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
        }
        return arr[arr.length-1]+arr[arr.length-2]+arr[arr.length-3];
    }  
    public static void main(String[] args) {
        int a=25;
        int b=check(a);
        System.out.println(b);
    }
}
