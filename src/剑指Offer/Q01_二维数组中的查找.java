package 剑指Offer;

/**
*
* @author loveincode
* @data Nov 28, 2017 11:01:29 AM
*/
public class Q01_二维数组中的查找 {
	
	public static void main(String[] args) {
		
	}
	
	/**
	 * type :  数组
	 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
	 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。 
	 */
	
	public boolean Find(int target, int [][] array) {
		int len = array.length-1;
        int i = 0;
        while((len >= 0)&& (i < array[0].length)){
            if(array[len][i] > target){
                len--;
            }else if(array[len][i] < target){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
	
}
