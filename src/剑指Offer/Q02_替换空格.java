package 剑指Offer;

/**
 *
 * @author loveincode
 * @data Nov 28, 2017 11:15:15 AM
 */
public class Q02_替换空格 {

	/**
	 * type : 字符串
	 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
	 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
	 */
	
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("hello world");
		System.out.println(replaceSpace(str));
	}

	public static String replaceSpace(StringBuffer str) {
		String string=  str.toString();
		string = string.replaceAll(" ", "%20");
		return string;
	}

}
