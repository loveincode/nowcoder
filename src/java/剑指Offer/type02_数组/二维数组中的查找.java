package 剑指Offer.type02_数组;

/**
 * @author loveincode
 * @data Nov 28, 2017 11:01:29 AM
 */
public class 二维数组中的查找 {

    public static void main(String[] args) {
        int[][] s = {{2, 1}, {2, 3},{1,2,3,5,6,8}};
        System.out.println(Find(9, s));
    }

    /**
     * type :  数组
     * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     */

    public static boolean Find(int target, int[][] array) {
        int len = array.length - 1;
        int i = 0;
        while ((len >= 0) && (i < array[0].length)) {
            if (array[len][i] > target) {
                len--;
            } else if (array[len][i] < target) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }

}
