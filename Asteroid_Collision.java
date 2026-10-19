import java.util.*;

public class Asteroid_Collision {
    public static int[] check(int[] asteroids){
        Stack<Integer> stack=new Stack<>();        
        for(int i=0;i<asteroids.length;i++){
            boolean alive=true;
            while(!stack.isEmpty() && stack.peek()>0 && asteroids[i]<0){
                int last=stack.pop();
                if(last>Math.abs(asteroids[i])){
                    stack.add(last);
                    alive=false;
                    break;
                }
                if(last==Math.abs(asteroids[i])){
                    alive=false;
                    break;
                }
                if(last<Math.abs(asteroids[i])){
                    alive=true;
                }
            }
            if(alive==true){
                stack.add(asteroids[i]);
            }
        }
        int[] result = new int[stack.size()];
        for (int j= 0; j < stack.size(); j++) {
            result[j] = stack.get(j);
        }
        return result;

    }
    public static void main(String[] args) {
        int[] asteroids = {5,10,-5};
        int[] h =check(asteroids);
        System.out.println(Arrays.toString(h));
    }
}
