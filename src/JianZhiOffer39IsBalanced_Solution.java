/**
 * Created by oliverwang on 2018/3/24.
 */


public class JianZhiOffer39IsBalanced_Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        return cheat(root) >= 0;
    }

    public int cheat(TreeNode root) {
        if (root == null) return 0;
        int left = cheat(root.left);
        int right = cheat(root.right);
        return (left >= 0 && right >= 0 && Math.abs(left - right) <= 1) ? 1 + Math.max(left, right) : -1;
    }


}
