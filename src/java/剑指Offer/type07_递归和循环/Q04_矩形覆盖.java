package 剑指Offer.type07_递归和循环;
/**
*
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
	
	public int RectCover(int target) {
		if(target<=0){
            return 0;
        }
		if(target==1){
            return 1;
        }
        else if(target==2){
            return 2;
        }else{
            return RectCover(target-1)+RectCover(target-2);
        }
    }

	public static void main(String[] args) {
	}
	
}
