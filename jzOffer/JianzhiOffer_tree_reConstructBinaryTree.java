/**
 * Created by oliverwang on 2018/3/9.
 */


public class JianzhiOffer_tree_reConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root =re(pre,0,pre.length-1,in,0,in.length-1);//传入前序遍历和中序遍历的序列，返回还原的二叉树。
        return root;
    }

    public TreeNode re(int[] pre,int startPre,int endPre,int[] in,int startIn,int endIn){
        if(startPre>endPre||startIn>endIn){//判定是否序列是否便利完。
            return null;
        }
        TreeNode root =new TreeNode(pre[startPre]);//存入节点
        for(int i=startIn;i<=endIn;i++){//从中序遍历开始，寻找和根节点相同的元素。
            if(in[i]==pre[startPre]){//找到了之后分为左右子树，递归进行查找。
                root.left=re(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right=re(pre,startPre+i-startIn+1,endPre,in,i+1,endIn);
            }
        }
        return root;
    }
}
