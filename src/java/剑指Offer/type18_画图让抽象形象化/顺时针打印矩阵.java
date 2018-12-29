package 剑指Offer.type18_画图让抽象形象化;

import java.util.ArrayList;

public class 顺时针打印矩阵 {
	
	/**
	 * type:画图让抽象形象化
	 * 
	 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
	 * 例如，如果输入如下矩阵：
	 *  1   2  3  4 
	 *  5   6  7  8 
	 *  9  10 11 12 
	 *  13 14 15 16 
	 *  则依次打印出数字
	 *  1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
	 * 
	 */
	
	public ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (matrix.length == 0)
			return null;
		int n = matrix.length;//行数
		int m = matrix[0].length;//列数
		if (m == 0)
			return null;
		int circle = (Math.min(n, m) - 1) / 2 + 1;//圈数
		for (int i = 0; i < circle; i++) {
			for (int k = i; k < m - i; k++)
				// →
				result.add(matrix[i][k]);
			for (int j = i + 1; j < n - i; j++)
				// ↓
				result.add(matrix[j][m - i - 1]);
			for (int k = m - i - 2; (k >= i) && (n - i - 1 != i); k--)
				// ←
				result.add(matrix[n - i - 1][k]);
			for (int j = n - i - 2; (j > i) && (m - i - 1 != i); j--)
				// ↑
				result.add(matrix[j][i]);
		}
		return result;
	}
	
	/*
	 * 解题思路：
	 * 顺时针打印就是按圈数循环打印，一圈包含两行或者两列，
	 * 在打印的时候会出现某一圈
	 * 中只包含一行，
	 * 要判断 从左向右 打印和 从右向左 打印的时候 是否会出现重复打印，
	 * 同样只包含一列时，
	 * 要判断 从上向下 打印和 从下向上 打印的时候 是否会出现重复打印的情况
	 */

}
