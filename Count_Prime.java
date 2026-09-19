public class Count_Prime {
    public static int check(int n){
        if(n<=2){
            return 0;
        }
        int[] dp=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=1;
        }
        dp[0]=0;
        dp[1]=0;

        for(int i=2;i<Math.sqrt(n)+1;i++){
            if(dp[i]==1){
                for(int num=i*i;num<n;num+=i){
                    dp[num]=0;
                }
            }
        }
        int sum=0;
        for(int i=0;i<dp.length;i++){
            sum+=dp[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=10;
        int h=check(n);
        System.out.println(h);
    }

    
}
