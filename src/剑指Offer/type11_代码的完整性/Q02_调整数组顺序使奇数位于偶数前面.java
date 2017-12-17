package 剑指Offer.type11_代码的完整性;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

/**
 *
 * @author loveincode
 * @data Dec 12, 2017 7:22:50 PM
 */
public class Q02_调整数组顺序使奇数位于偶数前面 {
	/**
	 * type : 代码的完整性
	 * 
	 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序， 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
	 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
	 */

	public static void reOrderArray(int[] array) {
		if (array.length > 1) {
			int a = 0;
			int b = 0;
			int[] a2 = new int[100];
			for (int i = 0; i < array.length; i++) {
				if (array[i] % 2 != 0) {
					// 奇数
					array[a++] = array[i];
				} else {
					a2[b++] = array[i];
				}
			}
			for (int i = 0; i < b; i++) {
				array[a++] = a2[i];
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		reOrderArray(array);
		System.out.println(array);
	}
}
