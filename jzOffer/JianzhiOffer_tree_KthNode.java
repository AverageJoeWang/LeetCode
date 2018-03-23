/**
 * Created by oliverwang on 2018/3/7.
 */


public class JianzhiOffer_tree_KthNode {
    int n = 0;//计数器
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot != null){//中序遍历寻找第k个
            TreeNode node = KthNode(pRoot.left, k);
            if(node != null) return node;
            n++;
            if(n == k) return pRoot;
            node = KthNode(pRoot.right, k);
            if(node != null) return node;
        }
        return null;
    }
}
