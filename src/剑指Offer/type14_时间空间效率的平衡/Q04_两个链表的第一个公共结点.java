package 剑指Offer.type14_时间空间效率的平衡;

import common.ListNode;

public class Q04_两个链表的第一个公共结点 {
	
	/*
	 * 输入两个链表，找出它们的第一个公共结点。
	 */
	
	/*
	 *  用两个指针扫描”两个链表“，最终两个指针到达 null 或者到达公共结点。
	 * 
	 * class Solution {
		public:
		    ListNode* FindFirstCommonNode( ListNode *pHead1, ListNode *pHead2) {
		        ListNode *p1 = pHead1;
		        ListNode *p2 = pHead2;
		        while(p1!=p2){
		            p1 = (p1==NULL ? pHead2 : p1->next);
		            p2 = (p2==NULL ? pHead1 : p2->next);
		        }
		        return p1;
		    }
		};
	 * 
	 */
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		if (pHead1 == null || pHead2 == null) {
			return null;
		}
		//计算长度
		int count1 = 0;
		ListNode p1 = pHead1;
		while (p1 != null) {
			p1 = p1.next;
			count1++;
		}
		int count2 = 0;
		ListNode p2 = pHead2;
		while (p2 != null) {
			p2 = p2.next;
			count2++;
		}
		//差
		int flag = count1 - count2;
		if (flag > 0) {
			while (flag > 0) {
				pHead1 = pHead1.next;
				flag--;
			}
			while (pHead1 != pHead2) {
				pHead1 = pHead1.next;
				pHead2 = pHead2.next;
			}
			return pHead1;
		}
		if (flag <= 0) {
			while (flag < 0) {
				pHead2 = pHead2.next;
				flag++;
			}
			while (pHead1 != pHead2) {
				pHead2 = pHead2.next;
				pHead1 = pHead1.next;
			}
			return pHead1;
		}
		return null;
	}
}
