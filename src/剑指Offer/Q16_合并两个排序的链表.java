package 剑指Offer;

import javax.xml.ws.AsyncHandler;

import common.ListNode;

/**
 *
 * @author loveincode
 * @data Dec 13, 2017 5:39:29 PM
 */
public class Q16_合并两个排序的链表 {

	/**
	 * type : 代码的鲁棒性
	 * 
	 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
	 * 
	 */

	public ListNode Merge(ListNode list1, ListNode list2) {
		if(list1==null) {
			return list2;
		}
		if(list2==null) {
			return list1;
		}
		ListNode node = null;
		if(list1.val<=list2.val) {
			node = list1;
			node.next = Merge(list1.next, list2);
		}else {
			node = list2;
			node.next = Merge(list1, list2.next);
		}
		return node;
	}
}
