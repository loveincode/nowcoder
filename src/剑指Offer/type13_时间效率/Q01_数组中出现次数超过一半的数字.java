package 剑指Offer.type13_时间效率;

import java.util.Arrays;

public class Q01_数组中出现次数超过一半的数字 {
	/**
	 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
	 * 
	 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
	 */
	
	
	
	
	public int MoreThanHalfNum_Solution(int [] array) {
		int len = array.length;
		if (len < 1) {
			return 0;
		}
		int count = 0;
		Arrays.sort(array);
		//数组排序后，如果符合条件的数存在，则一定是数组中间那个数。
		int num = array[len / 2];
		for (int i = 0; i < len; i++) {
			if (num == array[i])
				count++;
		}
		if (count <= (len / 2)) {
			num = 0;
		}
		return num;
	}
}
