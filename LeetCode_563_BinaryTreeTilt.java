/**
 * Created by oliverwang on 2018/1/29.
 */


public class LeetCode_563_BinaryTreeTilt {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x;}
    }
    int sum = 0;

    public int getValue(TreeNode root){
        if (root == null) return 0;
        int left = getValue(root.left);
        int right = getValue(root.right);
        sum += Math.abs(left - right);
        return root.val + left + right;
    }

    public int findTilt(TreeNode root) {
        getValue(root);
        return sum;
    }
}
