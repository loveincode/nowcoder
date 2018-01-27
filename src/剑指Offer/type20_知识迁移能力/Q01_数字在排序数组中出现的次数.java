package 剑指Offer.type20_知识迁移能力;

public class Q01_数字在排序数组中出现的次数 {
	
	/*
	 * 统计一个数字在排序数组中出现的次数。
	 */
	
	public int GetNumberOfK(int [] array , int k) {
		int sum = 0;
		for(int i=0;i< array.length;i++){
			if(array[i]==k){
				sum++;
			}
		}
		return sum;
    }
}
