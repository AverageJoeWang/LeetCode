/**
 * Created by oliverwang on 2018/1/20.
 */


public class LeetCode_226_InvertBinaryTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x;}
    }

    public TreeNode invertTree(TreeNode root){
        if (root == null)
            return null;
        TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
