/**
 * Created by wanglifei on 2017/12/15.
 */
public class _088_MergeSortedArray_with_NoMoreSpace {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int t = m + n -1, i = m - 1, j = n - 1;//利用尾插法，不需要额外的空间
        while(i >= 0 && j >= 0)
            nums1[t--] = nums1[i] >= nums2[j] ? nums1[i--]:nums2[j--];
        while(j >= 0)
            nums1[t--] = nums2[j--];
        while(i >= 0)
            nums1[t--] = nums1[i--];
    }
}
