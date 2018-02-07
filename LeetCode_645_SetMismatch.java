import java.util.HashSet;
import java.util.Set;

/**
 * Created by oliverwang on 2018/2/7.
 */


public class LeetCode_645_SetMismatch {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int duplicate = 0, n = nums.length;
        long sum = (n * (n+1)) / 2;
        for(int i : nums) {
            if(set.contains(i))
                duplicate = i;
            sum -= i;
            set.add(i);
        }
        return new int[] {duplicate, (int)sum + duplicate};
    }
}
