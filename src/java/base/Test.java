package base;

/**
 *
 * @author loveincode
 * @data 2018年2月26日 下午10:05:21
 */
public class Test {
	static boolean foo(char c) {
		System.out.print(c);
		return true;
	}

	public static void main(String[] argv) {
		int i = 0;
		for (foo('A'); foo('B') && (i < 2); foo('C')) {
			i++;
			foo('D');
		}
	}
	
	/*
	 * 
	 * for(条件1;条件2;条件3) {
		    //语句
		}
		执行顺序是条件1->条件2->语句->条件3->条件2->语句->条件3->条件2........
		如果条件2为true，则一直执行。如果条件2位false，则for循环结束
	 * 
	 * 
	 */
}
