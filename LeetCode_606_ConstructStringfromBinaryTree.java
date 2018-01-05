/**
 * Created by wanglifei on 2018/1/5.
 */
/**
 * Definition for a binary tree node.**/
public class LeetCode_606_ConstructStringfromBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public String tree2str(TreeNode t) {
        if (t==null) return "";
        StringBuilder str = new StringBuilder();
        str.append(t.val);
        if (t.left != null && t.right == null)
            str.append("(").append(tree2str(t.left)).append(")");
        else if (t.right != null)
            str.append("(").append(tree2str(t.left)).append(")").append("(").append(tree2str(t.right)).append(")");
        return str.toString();
    }
}
