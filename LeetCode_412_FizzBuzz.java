import java.util.LinkedList;
import java.util.List;

/**
 * Created by oliverwang on 2018/2/17.
 */


public class LeetCode_412_FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new LinkedList<>();
        int a = 1;
        while (a <= n){
            if (a % 3 == 0 && a % 5 == 0) list.add("FizzBuzz");
            else if (a % 3 == 0) list.add("Fizz");
            else if (a % 5 == 0) list.add("Buzz");
            else list.add("" + a);
            a++;
        }
        return list;
    }
}
