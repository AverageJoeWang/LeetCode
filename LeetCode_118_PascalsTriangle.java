import java.util.LinkedList;
import java.util.List;

/**
 * Created by wanglifei on 2017/12/19.
 */
public class LeetCode_118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new LinkedList<List<Integer>>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new LinkedList<Integer>();
            if (i == 1)
                row.add(1);
            if (i == 2) {
                row.add(1);
                row.add(1);
            }
            if (i >= 3) {
                for (int j = 0; j < i; j++) {
                    if (j == 0) {
                        row.add(1);
                    } else if (j == i - 1) {
                        row.add(1);
                    } else if (j != i - 1) {
                        List<Integer> list = rows.get(i - 2);
                        row.add(list.get(j - 1) + list.get(j));
                    }
                }
            }
            rows.add(row);
        }
        return rows;
    }
}