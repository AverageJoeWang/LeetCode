import java.util.HashMap;
import java.util.Map;

/**
 * Created by oliverwang on 2018/2/26.
 */


public class LeetCode_242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Integer, Integer> map = new HashMap<>(26);
        for (int i = 0; i < 26; i++)
            map.put(i, 0);
        for (int i = 0; i < s.length(); i++)
        {
            int temp = map.get(s.charAt(i) - 'a');
            map.put(s.charAt(i) - 'a', temp + 1);
        }
        for (int i = 0; i < t.length(); i++)
        {
            int temp = map.get(t.charAt(i) - 'a');
            map.put(t.charAt(i) - 'a', temp - 1);
        }
        for (int i = 0; i < 26; i++)
            if (map.get(i) != 0) return false;
        return true;
    }
}
