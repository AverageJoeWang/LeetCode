import java.util.Stack;

/**
 * Created by oliverwang on 2018/3/17.
 */


public class JianZhiOffer21IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int popIndex = 0;
        for (int i = 0; i < pushA.length; i++){
            stack.push(pushA[i]);
            while (stack.size() != 0 && stack.peek() == popA[popIndex]){
                stack.pop();
                popIndex++;
            }
        }
        return stack.size() == 0;
    }
}
