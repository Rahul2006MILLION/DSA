import java.util.HashSet;

public class Distribute_Candies {
    public static int check(int[] candyType){
        HashSet<Integer> s=new HashSet<>();
        int n=candyType.length;
        for(int i=0;i<n;i++){
            s.add(candyType[i]);
        } 
        int a=n/2;
        if(s.size()<a){
            return s.size();
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a={1,1,2,2,3,3};
        int b=check(a);
        System.out.println(b);
    }
    
}
