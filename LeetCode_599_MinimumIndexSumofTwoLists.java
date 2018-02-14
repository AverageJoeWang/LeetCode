import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by oliverwang on 2018/2/14.
 */


public class LeetCode_599_MinimumIndexSumofTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        int res = Integer.MAX_VALUE;

        List<String> restaurant = null;
        for (int i = 0; i < list1.length; i++)
            map1.put(list1[i], i);
        for (int i = 0; i < list2.length; i++)
            map2.put(list2[i], i);

        for (int i = 0; i < list2.length; i++){
            if (map1.containsKey(list2[i])){
                int n = map2.get(list2[i]) + map1.get(list2[i]);
                if (res > n){
                    res = n;
                    restaurant = new ArrayList<>();
                    restaurant.add(list2[i]);
                }else if (res == n)
                    restaurant.add(list2[i]);
            }
        }
        String [] result = new String[restaurant.size()];
        for (int i = 0; i < result.length; i++)
            result[i] = restaurant.get(i);
        return result;
    }
}
