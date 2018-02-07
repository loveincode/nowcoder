package leetcode.链表;

import common.ListNode;

public class Sort_List {
	
	/*
	 * Sort a linked list in O(n log n) time using constant space complexity.
	 */
	
	/*
	 * 因为题目要求复杂度为O(nlogn),故可以考虑归并排序  或 快速排序的思想。
		归并排序的一般步骤为：
		1）将待排序数组（链表）取中点并一分为二；
		2）递归地对左半部分进行归并排序；
		3）递归地对右半部分进行归并排序；
		4）将两个半部分进行合并（merge）,得到结果。
		
		所以对应此题目，可以划分为三个小问题：
		1）找到链表中点 （快慢指针思路，快指针一次走两步，慢指针一次走一步，快指针在链表末尾时，慢指针恰好在链表中点）；
		2）写出merge函数，即如何合并链表。 （见merge-two-sorted-lists 一题解析）
		3）写出mergesort函数，实现上述步骤。
	 */
	
	public ListNode sortList(ListNode head) {
		if (head == null || head.next == null)
            return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode right = sortList(slow.next);
        slow.next = null;
        ListNode left = sortList(head);
        // /待左右两边各自有序，进行归并即可
        ListNode temp_head = new ListNode(0);
        ListNode temp_node = temp_head;
        while (left != null && right != null) {
            if (left.val < right.val) {
                temp_node.next = left;
                left = left.next;
            } else {
                temp_node.next = right;
                right = right.next;
            }
            temp_node = temp_node.next;
        }
        if (left != null)
            temp_node.next = left;
        if (right != null)
            temp_node.next = right;
        return temp_head.next;
    }
	
	//解2 快排
	public ListNode sortList2(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode end = head;
        while(end.next!=null){
            end = end.next;
        }
        quickSort(head,end);
        return head;
    }
	
	public void quickSort(ListNode begin, ListNode end) {
        //判断为空，判断是不是只有一个节点
        if (begin == null || end == null || begin == end)
            return;
        //从第一个节点和第一个节点的后面一个几点
        ListNode first = begin;
        ListNode second = begin.next;
 
        int nMidValue = begin.val;
        //结束条件，second到最后了
        while (second != end.next && second != null) {
            if (second.val < nMidValue) {
                first = first.next;
                //判断一下，避免后面的数比第一个数小，不用换的局面
                if (first != second) {
                    int temp = first.val;
                    first.val = second.val;
                    second.val = temp;
                }
            }
            second = second.next;
        }
        //判断，有些情况是不用换的，提升性能
        if (begin != first) {
            int temp = begin.val;
            begin.val = first.val;
            first.val = temp;
        }
        //前部分递归
        quickSort(begin, first);
        //后部分递归
        quickSort(first.next, end);
    }
	
}
