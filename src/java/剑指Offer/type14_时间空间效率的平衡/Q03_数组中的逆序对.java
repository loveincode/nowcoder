package 剑指Offer.type14_时间空间效率的平衡;

public class Q03_数组中的逆序对 {
	/*
	 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
	 * 
	 * 输入一个数组,求出这个数组中的逆序对的总数P。
	 * 
	 * 并将P对1000000007取模的结果输出。
	 * 
	 * 即输出P%1000000007
	 */

	/*
	 * 输入描述: 题目保证输入的数组中没有的相同的数字 数据范围： 对于%50的数据,size<=10^4 对于%75的数据,size<=10^5
	 * 对于%100的数据,size<=2*10^5
	 * 
	 * 示例1 输入 1,2,3,4,5,6,7,0 输出 7
	 */

	/*
	 * 归并排序的改进，把数据分成前后两个数组(递归分到每个数组仅有一个数据项)，
	 * 合并数组，合并时，出现前面的数组值array[i]大于后面数组值array[j]时；则前面
	 * 数组array[i]~array[mid]都是大于array[j]的，count += mid+1 - i
	 * 参考剑指Offer，但是感觉剑指Offer归并过程少了一步拷贝过程。 还有就是测试用例输出结果比较大，对每次返回的count
	 * mod(1000000007)求余
	 */

	public static int InversePairs(int[] array) {
		if (array == null || array.length == 0) {
			return 0;
		}
		int[] copy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			copy[i] = array[i];
		}
		int count = InversePairsCore(array, copy, 0, array.length - 1);// 数值过大求余
		return count;

	}

	private static int InversePairsCore(int[] array, int[] copy, int low, int high) {
		if (low == high) {
			return 0;
		}
		int mid = (low + high) >> 1;
		int leftCount = InversePairsCore(array, copy, low, mid) % 1000000007;
		int rightCount = InversePairsCore(array, copy, mid + 1, high) % 1000000007;
		int count = 0;
		int i = mid;
		int j = high;
		int locCopy = high;
		while (i >= low && j > mid) {
			if (array[i] > array[j]) {
				count += j - mid;
				copy[locCopy--] = array[i--];
				if (count >= 1000000007)// 数值过大求余
				{
					count %= 1000000007;
				}
			} else {
				copy[locCopy--] = array[j--];
			}
		}
		for (; i >= low; i--) {
			copy[locCopy--] = array[i];
		}
		for (; j > mid; j--) {
			copy[locCopy--] = array[j];
		}
		for (int s = low; s <= high; s++) {
			array[s] = copy[s];
		}
		return (leftCount + rightCount + count) % 1000000007;
	}

	public static void main(String[] args) throws java.lang.Exception {
		int[] array = { 4, 3, 2, 1 };

		// System.out.println(InversePairs(array));
		System.out.println(2519);
		System.out.println(24903408);
		System.out.println(493330277);
		System.out.println(988418660);
	}
}
