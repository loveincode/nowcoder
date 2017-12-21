package 剑指Offer.type19_举例让抽象具体化;

public class Q04_二叉搜索树的后序遍历序列 {
	
	/*
	 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
	 * 
	 * 如果是则输出Yes,否则输出No。
	 * 
	 * 假设输入的数组的任意两个数字都互不相同。
	 */
	
	public boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence.length==0)
			return false;
		if(sequence.length==1)
			return true;
		
		
		return true;
    }

}
