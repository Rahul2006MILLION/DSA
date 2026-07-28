import java.util.ArrayList;
import java.util.List;

public class Kids_with_the_greatest_number_of_Candies {
    public static List<Boolean> check(int[] candies, int extracandies){
        List<Boolean> a=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extracandies>=max){
                a.add(true);
            }
            else{
                a.add(false);
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] c={2,3,5,1,3}; //try this: candies = [4,2,1,1,2], extracandies = 1 :)
        int d=3;
        List<Boolean> p=check(c, d);
        System.out.println(p);
    }
    
}
