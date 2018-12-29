package 剑指Offer.type13_时间效率;

import java.util.ArrayList;

public class Q02_最小的K个数 {
	
	/**
	 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
	 */
	
	/*
	*基于堆排序算法，构建最大堆。时间复杂度为O(nlogk)
	*如果用快速排序，时间复杂度为O(nlogn)；
	*如果用冒泡排序，时间复杂度为O(n*k)
	*/
	
	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>() ;
        if(input==null || k<=0 || k>input.length) return result ;
 
        for(int i=0 ; i<=k-1 ; i++) {
            for(int j=i+1 ; j<=input.length-1 ; j++) {
                if(input[i] > input[j]) {
                    int temp = input[i] ;
                    input[i] = input[j] ;
                    input[j] = temp ;
                }
            }
            result.add(input[i]) ;
        }
 
        return result ;
    }
	
}
