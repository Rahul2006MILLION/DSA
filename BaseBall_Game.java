import java.util.ArrayList;
import java.util.List;

public class BaseBall_Game {
    public static int check(String[] ops){
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<ops.length;i++){
            if(!ops[i].equals("C") && !ops[i].equals("D") && !ops[i].equals("+")){
                l.add(Integer.parseInt(ops[i]));
            }
            else if(ops[i].equals("C")){
                l.remove(l.size()-1);
            }
            else if(ops[i].equals(("D"))){
                int a=2*l.get(l.size()-1);
                l.add(a);
            }
            else if(ops[i].equals("+")){
                int x=l.get(l.size()-1)+l.get(l.size()-2);
                l.add(x);
            }
        }
        int sum=0;
        for(int i=0;i<l.size();i++){
            sum+=l.get(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        String[] a={"5","-2","4","C","D","9","+","+"};
        int n=check(a);
        System.out.println(n);
    }
    
}
