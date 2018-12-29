package 剑指Offer.type19_举例让抽象具体化;

import java.util.ArrayList;

import common.TreeNode;

public class Q05_二叉树中和为某一值的路径 {

	/*
	 *  输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
	 *  路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
	 * 
	 */
	
	/*
	 * 用带记忆的DFS来解决。分享一个这类问题的典型解法。
	 */

	// 全局变量，用于存储得到的每一个路径
    ArrayList<ArrayList<Integer>> resultsList = new ArrayList<ArrayList<Integer>>();
      
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<Integer> pathList = new ArrayList<Integer>();
        if (root == null) {
            return resultsList;
        }
          
        int curSum = 0;
        int index = 0;
        int []path = new int[1000];
        this.isTargetPath(root, target, curSum, path, index);
          
        return this.resultsList;
    }
      
    /**
     * 建立额外一个函数，用来实现递归求解
     * 递归求解函数
     * 思路很明白，把根节点到叶节点的路径上的值都加起来，
     * 所以在递归的过程中，需要逐个累加，并且累加的同时，还要将沿途经过的节点值记录下来，
     * 如何在递归函数中实现这一切功能呢？参数！！可用传参的方式解决
     *
     * @param eleNode   当前节点
     * @param target    目标和
     * @param curSum    当前已经累积到的和
     * @param path  记录到当前的节点位置，经过的路径
     * @param index 从根节点到当前节点为止，存的节点的数目
     */
    public void isTargetPath(TreeNode eleNode, int target, int curSum, int []path, int index) {
        if (eleNode == null) {
            return;
        }
          
        curSum += eleNode.val;
        // 把该节点包含进去
        path[index] = eleNode.val;
        index ++;
          
        // 当前已经是处于叶子节点，并且累计的和与target相等
        if (curSum == target && eleNode.left == null && eleNode.right == null) {
            // 将得到的结果放在外层结构中
            ArrayList<Integer> pathList = new ArrayList<Integer>();
            for (int i = 0; i < index; i++) {
                pathList.add(path[i]);
            }
            resultsList.add(pathList);
            return;
        }
          
        // 该节点有左子节点，前提还是要curSum 小于 target，否则递归就没有意义了
        if (curSum < target && eleNode.left != null) {
            this.isTargetPath(eleNode.left, target, curSum, path, index);
        }
          
        // 右子节点
        if (curSum < target && eleNode.right != null) {
            this.isTargetPath(eleNode.right, target, curSum, path, index);
        }
    }
}
