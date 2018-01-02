/**
 * Created by wanglifei on 2018/1/2.
 */
public class LeetCode_686_RepeatedStringMatch {
    public int repeatedStringMatch(String A, String B) {
        String res = A;
        int count = 1;
        if (res.length() >= B.length() && res.contains(B))
            return count;
        while (res.length() < B.length())
        {
            res += A;
            count++;
        }
        if (res.contains(B))
            return count;
        res += A;
        count++;
        if (res.contains(B))
            return count;
        return -1;
    }
}
