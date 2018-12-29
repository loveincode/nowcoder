package leetcode.树;

import common.TreeNode;

public class Minimum_Depth_Of_Binary_Tree {
	
	
	/*
	 * Given a binary tree, find its minimum depth.
	 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
	 * 
	 * 给定一个二叉树，找到它的最小深度，最小深度是从根节点到最近叶节点的最短路径上的节点数。
	 */
	
	public int run(TreeNode root) {
		if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        if(root.left!=null&&root.right!=null){
            int l=run(root.left);
            int r=run(root.right);
            return (l<r?l:r)+1;
        }
        if(root.left!=null){
            return run(root.left)+1;
        }else if(root.right!=null){
            return run(root.right)+1;
        }
        return 0;
    }

}
