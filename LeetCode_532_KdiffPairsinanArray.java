import java.util.Arrays;

/**
 * Created by wanglifei on 2017/12/31.
 */
public class LeetCode_532_KdiffPairsinanArray {
    public int findPairs(int[] nums, int k) {
        if(k<0 || nums.length<=1) return 0;
        Arrays.sort(nums);
        int count = 0, left = 0, right = 1;
        while(right<nums.length){
            int firNum = nums[left];
            int secNum = nums[right];
            if(secNum-firNum<k) right++;
            else if(secNum - firNum>k) left++;
            else{
                count++;
                while(left<nums.length && nums[left]==firNum) left++;
                while(right<nums.length && nums[right]==secNum) right++;
            }
            if(right==left) right++;
        }
        return count;
    }
}
