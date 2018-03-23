import java.util.Stack;

/**
 * Created by oliverwang on 2018/3/16.
 */


public class JianZhiOffer20StackMin {
    Stack<Integer> dataStack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();

    public void push(int node) {
        dataStack.push(node);
        if (minStack.isEmpty() || node < minStack.peek()) {
            minStack.push(node);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
