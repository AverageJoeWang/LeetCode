import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by oliverwang on 2018/3/17.
 */


public class JianZhiOffer22PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (root == null) return arrayList;
        Queue<TreeNode> queue = new LinkedList<>();
        arrayList.add(root.val);
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty()){
            int temp = i;
            i = 0;
            while (temp-- != 0){
                TreeNode treeNode = queue.remove();
                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                    arrayList.add(treeNode.left.val);
                    i++;
                }
                if (treeNode.right != null){
                    queue.add(treeNode.right);
                    arrayList.add(treeNode.right.val);
                    i++;
                }
            }
        }
        return arrayList;
    }
}
