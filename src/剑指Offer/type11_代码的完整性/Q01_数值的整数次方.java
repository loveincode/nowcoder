package 剑指Offer.type11_代码的完整性;

/**
 *
 * @author loveincode
 * @data Dec 12, 2017 7:12:17 PM
 */
public class Q01_数值的整数次方 {

	/**
	 * type:代码的完整性
	 * 
	 * 给定一个double类型的浮点数base和int类型的整数exponent。 求base的exponent次方。
	 */

	public double Power(double base, int exponent) {
		// 由于exponent是int类型的整数，则可能包含正整数、0以及负整数三种情况。
		double temp = 1;
		int n = exponent;
		if (exponent < 0) {
			exponent = -exponent;
		} else if (exponent == 0) {
			return 1;
		}
		for (int i = 1; i < exponent; i++) {
			temp *= base;
		}
		return n < 0 ? 1 / temp : temp;	
	}
}
