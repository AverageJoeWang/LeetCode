/**
 * Created by oliverwang on 2018/3/15.
 */


public class JianZhiOffer18HasSubtree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean res = false;
        if (root1 != null && root2 != null){
            if (root1.val == root2.val){
                res = DoesHasSubTree(root1, root2);
            }
            if (!res)
                res = HasSubtree(root1.left, root2);
            if (!res)
                res = HasSubtree(root1.right, root2);
        }
        return res;
    }

    public boolean DoesHasSubTree(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 != null) return false;
        if(root2 == null) return true;
        if(root1.val != root2.val) return false;
        return DoesHasSubTree(root1.left, root2.left) && DoesHasSubTree(root1.right, root2.right);
    }
}
