/**
 * Created by oliverwang on 2018/1/30.
 */


public class LeetCode_671_SecondMinimumNodeInaBinaryTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {val = x;}
    }
    public int findSecondMinimumValue(TreeNode root) {
        int[] data = new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE};
        getValue(root, data);
        return data[1] != Integer.MAX_VALUE ? data[1] : -1;
    }

    public void getValue(TreeNode root, int[] data){
        if (root == null) return;
        if (root.val < data[0]){
            data[1] = data[0];
            data[0] = root.val;
        }else if (root.val < data[1] && root.val > data[0])
            data[1] = root.val;
        getValue(root.left, data);
        getValue(root.right, data);
    }
}
