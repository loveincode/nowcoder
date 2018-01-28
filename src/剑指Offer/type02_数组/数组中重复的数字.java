package 剑指Offer.type02_数组;

public class 数组中重复的数字 {

	/*
	 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。
	 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
	 * 
	 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
	 */

	// Parameters:
	// numbers: an array of integers
	// length: the length of array numbers
	// duplication: (Output) the duplicated number in the array number,length of
	// duplication array is 1,so using duplication[0] = ? in implementation;
	// Here duplication like pointor in C/C++, duplication[0] equal *duplication
	// in C/C++
	// 这里要特别注意~返回任意重复的一个，赋值duplication[0]
	// Return value: true if the input is valid, and there are some duplications
	// in the array number
	// otherwise false
	public boolean duplicate(int numbers[], int length, int[] duplication) {
		int[] assist = new int[length];
		for (int i = 0; i < length; i++) {
			if (assist[numbers[i]] == 0) {
				assist[numbers[i]]++;
			} else {
				duplication[0] = numbers[i];
				return true;
			}
		}
		return false;
	}

	/*
	 * 最简单的方法：我最直接的想法就是构造一个容量为N的辅助数组B，原数组A中每个数对应B中下标，首次命中，B中对应元素+1。如果某次命中时，
	 * B中对应的不为0，说明，前边已经有一样数字了，那它就是重复的了。
	 * 举例：A{1,2,3,3,4,5}，刚开始B是{0,0,0,0,0,0}，开始扫描A。 A[0] = 1 {0,1,0,0,0,0} A[1] =
	 * 2 {0,1,1,0,0,0} A[2] = 3 {0,1,1,1,0,0} A[3] = 3
	 * {0,1,1,2,0,0}，到这一步，就已经找到了重复数字。 A[4] = 4 {0,1,1,2,1,0} A[5] = 5
	 * {0,1,1,2,1,1} 时间复杂度O（n），空间复杂度O（n），算法优点是简单快速，比用set更轻量更快，不打乱原数组顺序。
	 * 如果不能用辅助空间，可以参照剑指。
	 * 
	 */

}
