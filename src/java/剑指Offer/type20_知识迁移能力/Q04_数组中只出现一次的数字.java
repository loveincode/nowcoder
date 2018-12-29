package 剑指Offer.type20_知识迁移能力;

public class Q04_数组中只出现一次的数字 {

	/*
	 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
	 */

	/*
	 * 考虑过程： 首先我们考虑这个问题的一个简单版本：一个数组里除了一个数字之外，其他的数字都出现了两次。请写程序找出这个只出现一次的数字。
	 * 
	 * 这个题目的突破口在哪里？题目为什么要强调有一个数字出现一次，其他的出现两次？我们想到了异或运算的性质：任何一个数字异或它自己都等于0
	 * 。也就是说，如果我们从头到尾依次异或数组中的每一个数字，那么最终的结果刚好是那个只出现一次的数字，因为那些出现两次的数字全部在异或中抵消掉了。
	 * 
	 * 有了上面简单问题的解决方案之后，我们回到原始的问题。如果能够把原数组分为两个子数组。在每个子数组中，包含一个只出现一次的数字，而其它数字都出现两次
	 * 。如果能够这样拆分原数组，按照前面的办法就是分别求出这两个只出现一次的数字了。
	 * 
	 * 我们还是从头到尾依次异或数组中的每一个数字，那么最终得到的结果就是两个只出现一次的数字的异或结果。因为其它数字都出现了两次，在异或中全部抵消掉了。
	 * 由于这两个数字肯定不一样，那么这个异或结果肯定不为0 ，也就是说在这个结果数字的二进制表示中至少就有一位为1 。我们在结果数字中找到第一个为1
	 * 的位的位置，记为第N 位。现在我们以第N 位是不是1 为标准把原数组中的数字分成两个子数组，第一个子数组中每个数字的第N 位都为1
	 * ，而第二个子数组的每个数字的第N 位都为0 。
	 * 
	 * 现在我们已经把原数组分成了两个子数组，每个子数组都包含一个只出现一次的数字，而其它数字都出现了两次。因此到此为止，所有的问题我们都已经解决。
	 */

	// num1,num2分别为长度为1的数组。传出参数
	// 将num1[0],num2[0]设置为返回结果
	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		if (array == null || array.length <= 1) {
			num1[0] = num2[0] = 0;
			return;
		}
		int len = array.length, index = 0, sum = 0;
		for (int i = 0; i < len; i++) {
			sum ^= array[i];
		}
		for (index = 0; index < 32; index++) {
			if ((sum & (1 << index)) != 0)
				break;
		}
		for (int i = 0; i < len; i++) {
			if ((array[i] & (1 << index)) != 0) {
				num2[0] ^= array[i];
			} else {
				num1[0] ^= array[i];
			}
		}
	}

	/**
	 * 数组a中只有一个数出现一次，其他数都出现了2次，找出这个数字
	 * 
	 * @param a
	 * @return
	 */
	public static int find1From2(int[] a) {
		int len = a.length, res = 0;
		for (int i = 0; i < len; i++) {
			res = res ^ a[i];
		}
		return res;
	}

	/**
	 * 数组a中只有一个数出现一次，其他数字都出现了3次，找出这个数字
	 * 
	 * @param a
	 * @return
	 */
	public static int find1From3(int[] a) {
		int[] bits = new int[32];
		int len = a.length;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < 32; j++) {
				bits[j] = bits[j] + ((a[i] >>> j) & 1);
			}
		}
		int res = 0;
		for (int i = 0; i < 32; i++) {
			if (bits[i] % 3 != 0) {
				res = res | (1 << i);
			}
		}
		return res;
	}

}
