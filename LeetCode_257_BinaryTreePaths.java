import java.util.*;

/**
 * Created by oliverwang on 2018/1/20.
 */


public class LeetCode_257_BinaryTreePaths {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x;}
    }
    List<String> result = new LinkedList<>();
    List<Integer> path = new LinkedList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return result;
        getPath(root);
        return result;
    }

    public void getPath(TreeNode node){
        if (node == null) return;
        path.add(node.val);
        if (node.left == null && node.right == null)
        {
            StringBuilder buffer = new StringBuilder();
            for (int i = 0; i < path.size(); i++)
            {
                if (i!=0)
                    buffer.append("->");
                buffer.append(path.get(i));
            }
            result.add(buffer.toString());
        }
        getPath(node.left);
        getPath(node.right);
        path.remove(path.size()-1);
    }
}
