package 剑指Offer.type19_举例让抽象具体化;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

import common.TreeNode;

public class Q03_从上往下打印二叉树 {
	
	/*
	 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印
	 */
	
	/*
	 * 思路   二叉树的层次遍历，借助一个队列就可以了。
	 */
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null) return result;
        //队列
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        deque.add(root);
        while(!deque.isEmpty()){
            TreeNode t = deque.pop();
            result.add(t.val);
            if(t.left != null) deque.add(t.left);
            if(t.right != null) deque.add(t.right);
        }
        return result;
    }
	
}
