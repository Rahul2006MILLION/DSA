public class plusone {
    public static int[] plusonee(int[] d){
        int n=d.length;
        for(int i=n-1;i>=0;i--){
            if(d[i]<9){
                d[i]+=1;
                return d;
            }
            d[i]=0;
        }
        int[] arr=new int[n+1];
        arr[0]=1;
        return arr;

    }
    public static void main(String[] args){
        int[] dig={9,9,9};
        int n=dig.length;
        int[] res=plusonee(dig);
        for(int j=0;j<n+1;j++){
            System.out.println(res[j]);
        }
    }
        
    }
