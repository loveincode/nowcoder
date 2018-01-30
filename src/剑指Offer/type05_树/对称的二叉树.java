package 剑指Offer.type05_树;

import common.TreeNode;

public class 对称的二叉树 {
	
	/*
	 * 请实现一个函数，用来判断一颗二叉树是不是对称的。
	 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
	 */
	
	boolean isSymmetrical(TreeNode pRoot)
    {	
		isSymmetrical(pRoot.left);
        isSymmetrical(pRoot.right);
        if (pRoot==null) 
        if(pRoot.left!=null && pRoot.right!=null && pRoot.left==pRoot.right) {
        }
        else {
        	return false;
        }
        
    }
}
