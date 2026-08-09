public class Can_Place_Flowers {
    public static boolean check(int[] flowerbed, int n){
        if(n==0){
            return true;
        }
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i==flowerbed.length-1 || flowerbed[i+1]==0)){
                flowerbed[i]=1;
                n-=1;
            }
            if(n==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] fl={1,0,0,0,1};
        int nu=2;
        boolean d=check(fl, nu);
        System.out.println(d);
    }
    
}
