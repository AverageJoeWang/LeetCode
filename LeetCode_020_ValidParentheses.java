import java.util.HashMap;
import java.util.Stack;

/**
 * Created by wanglifei on 2018/1/6.
 */
public class LeetCode_020_ValidParentheses {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++)
        {
            if (!stack.empty() && map.get(stack.peek()) == null)
                return false;
            if (!stack.empty() && map.get(stack.peek()) == s.charAt(i))
                stack.pop();
            else stack.push(s.charAt(i));
        }
        return stack.empty();
    }
}
