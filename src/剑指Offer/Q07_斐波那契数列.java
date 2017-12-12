package 剑指Offer;
/**
*
* @author loveincode
* @data Dec 12, 2017 4:52:01 PM
*/
public class Q07_斐波那契数列 {
	/**
	 * 大家都知道斐波那契数列
	 * 
	 * 现在要求输入一个整数n，请你输出斐波那契数列的第n项。
	 * 
	 * n<=39
	 * 
	 */
	public int Fibonacci(int n) {
		return fib(n);
    }
	
	public int fib(int n) {
		if(n<=0)
            return 0;
		if(n==1) {
			return 1;
		}
		if(n==2) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}

}
