package 剑指Offer;
/**
*
* @author loveincode
* @data Dec 12, 2017 5:06:01 PM
*/
public class Q09_变态跳台阶 {
	/**
	 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
	 * 
	 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
	 * 
	 */
	public int JumpFloorII(int target) {
		if(target <= 0){
            return 0;
        }
		if(target == 1){
            return 1;
        }
        else{
            int sum = 1;
            for(int i = 1; i < target ; i ++){
                sum += JumpFloorII(i);
            }
            return sum;
        }
		
		//2 return 1<<--target;
    }
	
}
