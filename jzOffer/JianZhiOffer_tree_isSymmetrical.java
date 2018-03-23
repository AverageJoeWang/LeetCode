

public class JianZhiOffer_tree_isSymmetrical {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot == null) return true;
        return getSymmetrical(pRoot.left, pRoot.right);
    }
    
    boolean getSymmetrical(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null) return true;
        else if(node1 != null && node2 != null && node1.val == node2.val){
           return getSymmetrical(node1.left, node2.right) && getSymmetrical(node1.right, node2.left);
        }
        else return  false;
    }
}