
import java.util.HashSet;
import java.util.Set;

/**
 * Created by oliverwang on 2018/2/12.
 */


public class LeetCode_202_HappyNumber {
    public boolean isHappy(int n) {
        int cur = n;
        if(n == 1) return true;
        Set<Integer> intSet = new HashSet<>();
        while(cur > 0){
            int sum = 0;
            while(cur > 0){
                int rem = cur % 10;
                sum += rem * rem;
                cur = cur / 10;
            }
            if(sum == 1 ) return true;
            if(intSet.contains(sum)) return false;
            else intSet.add(sum);
            cur = sum;
        }
        return true;
    }
}
