import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by oliverwang on 2018/2/17.
 */


public class LeetCode_575_DistributeCandies {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int n : candies) set.add(n);
        return Math.min(candies.length/2, set.size());
    }
}
