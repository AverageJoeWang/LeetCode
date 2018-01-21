import java.util.*;

/**
 * Created by oliverwang on 2018/1/19.
 */
//BFS
public class LeetCode_637_AverageofLevelsinBinaryTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x;}
    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new LinkedList<>();
        List<TreeNode> list = new LinkedList<>();
        list.add(root);
        while (!list.isEmpty()){
            int size = list.size();
            double sum = 0.0;
            for (int i = 0; i < size; i++)
            {
                TreeNode node = list.get(0);
                sum += node.val;
                if (node.left != null)
                    list.add(node.left);
                if (node.right != null)
                    list.add(node.right);
                list.remove(node);
            }
            double avg = sum/size;
            result.add(avg);

        }
        return result;
    }
}
