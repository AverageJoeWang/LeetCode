import java.util.ArrayList;
import java.util.List;

/**
 * Created by oliverwang on 2018/2/24.
 */


public class LeetCode_690_EmployeeImportance {
    public int getImportance(List<Employee> employees, int id) {
        int importance = 0;
        List<Integer> subordinates = new ArrayList<Integer>();
        for (Employee e : employees) {
            if (e.id == id) {
                importance = e.importance;
                subordinates = e.subordinates;
                for (Integer i : subordinates)
                    importance = importance + getImportance(employees, i);
                break;
            }
        }
        return importance;
    }
}
