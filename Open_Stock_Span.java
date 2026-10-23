
import java.util.Stack;
public class Open_Stock_Span {
    Stack<int[]> stack;
    public Open_Stock_Span() {
        stack = new Stack<>();
    }
    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.peek()[1];
            stack.pop();
        }
        stack.push(new int[]{price, span});
        return span;
    }
    public static void main(String[] args) {
        Open_Stock_Span obj = new Open_Stock_Span();

        System.out.println(obj.next(100));
        System.out.println(obj.next(80));
        System.out.println(obj.next(60));
        System.out.println(obj.next(70));
        System.out.println(obj.next(60));
        System.out.println(obj.next(75));
        System.out.println(obj.next(85));
    }
}
