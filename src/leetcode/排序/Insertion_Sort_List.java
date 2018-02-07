package leetcode.排序;

import common.ListNode;

public class Insertion_Sort_List {
	/*
	 * Sort a linked list using insertion sort.
	 */
	
	/*
	 *  思路:新建一个链表,遍历原链表，将每个节点加入新链表正确的位置
	 */
	public ListNode insertionSortList(ListNode head) {
		//哑节点
        ListNode dumy = new ListNode(Integer.MIN_VALUE);
        ListNode cur = head;
        ListNode pre = dumy;
        while (cur != null) {
            //保存当前节点下一个节点
            ListNode next = cur.next;
            pre = dumy;
            //寻找当前节点正确位置的一个节点
            while (pre.next != null && pre.next.val < cur.val) {
                pre = pre.next;
            }
            //将当前节点加入新链表中
            cur.next = pre.next;
            pre.next = cur;
            //处理下一个节点
            cur = next;
        }
        return dumy.next;
    }
}
