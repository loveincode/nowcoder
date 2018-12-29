package 剑指Offer.type20_知识迁移能力;

public class Q07_左旋转字符串 {

	/*
	 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
	 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
	 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
	 */
	
	/*
	 * 这道题考的核心是应聘者是不是可以灵活利用字符串翻转。
	 * 假设字符串abcdef，n=3，
	 * 设X=abc，Y=def，所以字符串可以表示成XY，如题干，问如何求得YX。
	 * 假设X的翻转为XT，XT=cba，同理YT=fed，那么YX=(XTYT)T，三次翻转后可得结果。
	 * 
	 */
	public String LeftRotateString(String str, int n) {
		if (str.length() == 0) {
			return str;
		}
		StringBuffer buffer = new StringBuffer(str);
		StringBuffer buffer1 = new StringBuffer(str);
		StringBuffer buffer2 = new StringBuffer();
		buffer.delete(0, n);
		buffer1.delete(n, str.length());
		buffer2.append(buffer.toString()).append(buffer1.toString());
		return buffer2.toString();
	}

}
