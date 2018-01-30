package 剑指Offer.type03_链表;

import common.ListNode;

public class 删除链表中重复的结点 {
	/*
	 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 
	 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
	 */
	
	public static ListNode deleteDuplication(ListNode pHead)
    {
		ListNode first = new ListNode(-1);//设置一个trick
        first.next = pHead;
        ListNode last = first;
        //当前和 下一个不为空
        while (pHead != null && pHead.next != null) {
        	//当前值等于下一个结点值
            if (pHead.val == pHead.next.val) {
            	//记录下当前值
                int val = pHead.val;
                //将所有重复的结点都过滤掉
                while (pHead!= null&&pHead.val == val)
                	//重点 将剩余的都过滤掉
                    pHead = pHead.next;
                last.next = pHead;
            //当前值不等于下一个结点值 正常走
            } else {
                last = pHead;
                pHead = pHead.next;
            }
        }
        return first.next;
    }
	
	public static void main(String[] args) {
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ListNode head3 = new ListNode(3);
		ListNode head4 = new ListNode(3);
		ListNode head5 = new ListNode(4);
		ListNode head6 = new ListNode(4);
		ListNode head7 = new ListNode(5);
		head1.next = head2;
		head2.next = head3; 	
		head3.next = head4;
		head4.next = head5;
		head5.next = head6;
		head6.next = head7;
		ListNode head = deleteDuplication(head1);
		while(head!=null) {
			System.out.println(head.val);
			head= head.next;
		}
		
	}
}
