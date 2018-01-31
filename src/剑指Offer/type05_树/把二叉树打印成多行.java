package 剑指Offer.type05_树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import common.TreeNode;

public class 把二叉树打印成多行 {
	
	/*
	 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
	 */
	/*
	* 队列LinkedList完成层序遍历，用end记录每层结点数目
	*/
	ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null){
            return result;
        }
        Queue<TreeNode> layer = new LinkedList<TreeNode>();
        ArrayList<Integer> layerList = new ArrayList<Integer>();
        layer.add(pRoot);
        int start = 0, end = 1;
        while(!layer.isEmpty()){
            TreeNode cur = layer.remove();
            layerList.add(cur.val);
            start++;
            if(cur.left!=null){
                layer.add(cur.left);           
            }
            if(cur.right!=null){
                layer.add(cur.right);
            }
            if(start == end){
                end = layer.size();
                start = 0;
                result.add(layerList);
                layerList = new ArrayList<Integer>();
            }
        }
        return result;
    }
	
}
