import java.util.Scanner;

/*
         时间限制：C/C++语言 1000MS；其他语言 3000MS
	内存限制：C/C++语言 65536KB；其他语言 589824KB
	题目描述：
	假如一个数组中存储了一个股票，在一天交易窗口内各时间点的股票价格（正整数）。只允许一次买入和一次卖出，请提供一个算法，计算出通过卖出和买入可以得到的最大利润
	
	
	输入
	价格序列，用,号隔开
	输出
	最大的可能利润
	
	
	样例输入
	2,3,2,4
	样例输出
	2
 */
public class 股票利润 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			String line = in.nextLine();
			String[] arry = line.split(",");
			int result = 0;
			int length = arry.length;
			for (int i = 0; i < length; i++) {
				int a = Integer.valueOf(arry[i]);
				for (int j = i + 1; j < length; j++) {
					int b = Integer.valueOf(arry[j]);
					if (b > a) {
						int c = b - a;
						if (c > result) {
							result = c;
						}
					}
				}
			}
			System.out.println(result);
		}
		in.close();
	}

}
