/**
 * Created by oliverwang on 2018/1/23.
 */


public class LeetCode_687_LongestUnivaluePath {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {val = x;}
    }
    int res = 0;
    public int longestUnivaluePath(TreeNode root) {
        getValue(root, 0);
        return res;
    }
    public int getValue(TreeNode root, int n){
        if (root == null) return 0;
        int left = getValue(root.left, root.val);
        int right = getValue(root.right, root.val);
        res = Math.max(res, left+right);
        return root.val == n ? Math.max(left, right) + 1 : 0;
    }
}
