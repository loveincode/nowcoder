package 剑指Offer.type19_举例让抽象具体化;

public class Q04_二叉搜索树的后序遍历序列 {
	
	/*
	 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
	 * 
	 * 如果是则输出Yes,否则输出No。
	 * 
	 * 假设输入的数组的任意两个数字都互不相同。
	 */
	
	/*
	 * 先序遍历 根左右
	 * 中序遍历 左根右
	 * 后序遍历 左右根 
	 * BST的后序序列的合法序列是，对于一个序列S，最后一个元素是end （也就是根），
	 * 如果去掉最后一个元素的序列为T，
	 * 那么T满足：T可以分成两段，前一段（左子树）小于end，后一段（右子树）大于end
	 * 且这两段（子树）都是合法的后序序列。完美的递归定义 : ) 。
	 */
	
	public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0) return false;
        return IsTreeBST(sequence, 0, sequence.length-1);
    }
    public boolean IsTreeBST(int [] sequence,int start,int end ){
        if(end <= start) return true;
        int i = start;
        for (; i < end; i++) {
            if(sequence[i] > sequence[end]) break;
        }
        for (int j = i; j < end; j++) {
            if(sequence[j] < sequence[end]) return false;
        }
        return IsTreeBST(sequence, start, i-1) && IsTreeBST(sequence, i, end-1);
    }
}
