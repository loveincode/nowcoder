package 剑指Offer.type07_递归和循环;

/**
 * @author loveincode
 * @data Dec 12, 2017 5:15:44 PM
 */
public class Q04_矩形覆盖 {

    /*
     * type : 递归和循环
     *
     * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
     *
     * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
     *
     */

    public static int RectCover(int target) {
        if (target <= 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        } else if (target == 2) {
            return 2;
        } else {
            return RectCover(target - 1) + RectCover(target - 2);
        }
    }


    //动态规划
    public static int cover(int target) {
        if (target == 0) return 0;
        if (target == 1) return 1;
        if (target == 2) return 2;
        Integer[] b = new Integer[target + 1];
        b[1] = 1;
        b[2] = 2;
        int i = 3;
        while (i <= target) {
            b[i] = b[i - 1] + b[i - 2];
            i++;
        }
        return b[target];
    }

    public static void main(String[] args) {
        System.out.println(RectCover(11));
        System.out.println(cover(11));
    }

}
