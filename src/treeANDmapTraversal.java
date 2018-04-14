import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by oliverwang on 2018/4/14.
 */


public class treeANDmapTraversal {

    //根据前序，中序创建二叉树
    public TreeNode createTreeFromPreAndin(int [] pre, int [] in){
        TreeNode root = re(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return root;
    }

    public TreeNode re(int [] pre, int startPre, int endPre, int [] in, int startIn, int endIn){
        if (startPre > endPre || startIn > endIn){
            return null;//遍历结束条件
        }
        TreeNode root = new TreeNode(pre[startPre]);
        for (int i = startIn; i < endIn; i++){
            if (in[i] == pre[startPre]){
                root.left = re(pre, startPre+1, endPre+i-startIn, in, startIn, i - 1);
                root.right = re(pre, startPre + i - startIn + 1, endPre, in, i + 1, endIn);
            }
        }
        return root;
    }

    //前序遍历
    public void preOrder(TreeNode root){
        while (root != null){
            System.out.println(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    //中序遍历
    public void inOrder(TreeNode root){
        while (root != null){
            inOrder(root.left);
            System.out.println(root.val);
            inOrder(root.right);
        }
    }

    public void inOrderuncur(TreeNode root){
        TreeNode p = root;
        LinkedList<TreeNode> list = new LinkedList<>();
        while (p != null || !list.isEmpty()){
            if (p != null){
                list.push(p);
                p = p.left;
            }else {
                p = list.pop();
                System.out.println(p.val);
                p = p.right;
            }
        }
    }

    //后续遍历
    public void postOrder(TreeNode root){
        while (root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.val);
        }
    }



    //求树的深度 =
    public int depthOrder(TreeNode root){
        if (root == null) return 0;
        int left = depthOrder(root.left);
        int right = depthOrder(root.right);
        return left > right ? (left + 1) : (right + 1);
    }

    //层次遍历
    public void levelOrder(TreeNode root){
        LinkedList<TreeNode> queue = new LinkedList<>();
        TreeNode p;
        queue.push(root);
        while (!queue.isEmpty()){
            p = queue.removeFirst();
            System.out.println(p.val);
            if (p.left != null){
                queue.addLast(p.left);
            }
            if (p.right != null){
                queue.addLast(p.right);
            }
        }
    }

    //统计叶子数量
    public int leafNumber(TreeNode root){
        if (root == null){
            return 0;
        }else {
            if (root.left == null && root.right == null){
                return 1;
            }else {
                return leafNumber(root.left) + leafNumber(root.right);
            }
        }
    }

    //统计叶子数量
    public int leafNumberUncur(TreeNode root){
        LinkedList<TreeNode> queue = new LinkedList<>();
        int count = 0;
        if (root != null){
            queue.push(root);
        }
        while (!queue.isEmpty()){
            TreeNode temp = queue.pop();
            if (temp.left == null && temp.right == null) count++;
            else {
                if (temp.left != null) queue.push(temp.left);
                if (temp.right != null) queue.push(temp.right);
            }
        }
        return count;
    }


}
