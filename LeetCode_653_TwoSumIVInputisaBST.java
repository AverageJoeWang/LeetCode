import java.util.HashSet;

/**
 * Created by oliverwang on 2018/1/19.
 */


public class LeetCode_653_TwoSumIVInputisaBST {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {val = x;}
    }
    HashSet<Integer> hashSet = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        if (hashSet.contains(k - root.val)) return true;
        hashSet.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
