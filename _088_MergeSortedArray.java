/**
 * Created by wanglifei on 2017/12/15.
 */
public class _088_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[];//利用第三个数组，时间复杂度是O(n),此时需要额外的空间
        temp = new int[m + n];
        int i = 0, j = 0, t = 0;
        while (i < m && j < n)
            if(nums1[i] < nums2[j])
            {
                temp[t++] = nums1[i++];
            }else {
                temp[t++] = nums2[j++];
            }
        while(i < m)
            temp[t++] = nums1[i++];
        while (j < n)
            temp[t++] = nums2[j++];
        while (--t >= 0)
            nums1[t] = temp[t];
    }
}
