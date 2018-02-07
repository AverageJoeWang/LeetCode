import java.util.LinkedList;
import java.util.List;

/**
 * Created by oliverwang on 2018/2/7.
 */


public class LeetCode_728_SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new LinkedList<>();
        for (int i = left; i <= right; i++){
            if (isSelfDividingNumbers(i))
                list.add(i);
        }
        return list;
    }

    public boolean isSelfDividingNumbers(int number){
        int a = number;
        while (a != 0){
            int n = a%10;
            if (n == 0 ||number%n != 0)
                return false;
            a /= 10;
        }
        return true;
    }
}
