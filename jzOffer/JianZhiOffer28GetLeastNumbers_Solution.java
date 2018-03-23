import java.util.ArrayList;

/**
 * Created by oliverwang on 2018/3/21.
 */


public class JianZhiOffer28GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input.length == 0 || k <= 0 || k > input.length) return list;
        for (int i = 0; i < k; i++){
            for (int j = i + 1; j < input.length; j++){
                if (input[i] > input[j]){
                    int temp = input[j];
                    input[j] = input[i];
                    input[i] = temp;
                }
            }
            list.add(input[i]);
        }
        return list;
    }
}
