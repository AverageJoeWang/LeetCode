import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by oliverwang on 2018/2/16.
 */


public class LeetCode_500_KeyboardRow {
    public String[] findWords(String[] words) {
        String s1="QWERTYUIOPqwertyuiop";
        String s2="ASDFGHJKLasdfghjkl";
        String s3="ZXCVBNMzxcvbnm";
        Map<Character, Integer> map = new HashMap<>();
        getValue(map, s1, 1);
        getValue(map, s2, 2);
        getValue(map, s3, 3);
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < words.length; i++){
            boolean flag = true;
            for (int j = 1; j < words[i].length(); j++){
                if (!map.get(words[i].charAt(j)).equals(map.get(words[i].charAt(0)))){
                    flag = false;
                    break;
                }
            }
            if (flag) arrayList.add(words[i]);
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    private void getValue(Map<Character, Integer> map, String s, int n){
        for (int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), n);
    }
}
