/**
 * Created by oliverwang on 2018/1/25.
 */


public class LeetCode_669_TrimaBinarySearchTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {val = x;}
    }
    public TreeNode trimBST(TreeNode root, int L, int R)
    {
        if(root == null)
            return null;
        if(root.val > R)
        {
            root = root.left;
            root = trimBST(root, L, R);
        }
        else if(root.val < L)
        {
            root = root.right;
            root = trimBST(root, L, R);
        }
        else
        {
            root.left = trimBST(root.left, L, R);
            root.right = trimBST(root.right, L, R);
        }
        return root;
    }
}
