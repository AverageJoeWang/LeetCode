/**
 * Created by oliverwang on 2018/3/4.
 */

public class JianzhiOffer_tree_GetNext {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        TreeLinkNode curNode = null;
        //第一步：判断是否有右孩子
        if(pNode.right != null){
            curNode = pNode.right;
            while(curNode.left != null) curNode = curNode.left;
            return curNode;
        }
        //第二步：判断是否是其父节点的左孩子
        if(pNode.next == null) return null;
        if(pNode == pNode.next.left){
            return pNode.next;
        }
        //第三步：向上找其父节点，直到父节点是其父节点的父节点的左孩子
        curNode = pNode.next;
        while(curNode.next != null){
            if(curNode == curNode.next.left){
                return curNode.next;
            }
            //继续向上找父节点
            curNode = curNode.next;
        }
        return null;
    }
}




