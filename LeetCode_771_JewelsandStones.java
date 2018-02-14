import java.util.HashMap;
import java.util.Map;

/**
 * Created by oliverwang on 2018/2/14.
 */

//J表示珠宝种类，S表示拥有的石头；判断S中有多少珠宝
public class LeetCode_771_JewelsandStones {
    public int numJewelsInStones(String J, String S) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < S.length(); i++){
            int temp = 1;
            if (map.containsKey(S.charAt(i)))
                temp = map.get(S.charAt(i)) + 1;
            map.put(S.charAt(i), temp);
        }
        for (int i = 0; i < J.length(); i++){
            if (map.containsKey(J.charAt(i)))
                res += map.get(J.charAt(i));
        }
        return res;
    }
}
