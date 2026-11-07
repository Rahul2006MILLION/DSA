import java.util.Arrays;
import java.util.Stack;

public class Daily_Temperatures {
    public static int[] check(int[] temperatures){
        int[] res=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            res[i]=0;
        }
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[i]> temperatures[stack.peek()]){
                int previous_day=stack.pop();
                res[previous_day]=i-previous_day;
            }
            stack.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] t={73,74,75,71,69,72,76,73};
        int[] y=check(t);
        System.out.println(Arrays.toString(y));
    }
    
}
