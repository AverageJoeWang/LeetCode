import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by oliverwang on 2018/2/23.
 */


public class LeetCode_49_IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList result = new ArrayList();
        int mark = 0;
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length; ) {
            if (nums1[i] == nums2[j]) {
                if (result.size() == 0 || nums1[i] != mark) {
                    result.add(nums1[i]);
                    mark = nums1[i];
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = (int) result.get(i);
        }
        return res;
    }
}
