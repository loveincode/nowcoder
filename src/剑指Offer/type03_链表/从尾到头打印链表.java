package 剑指Offer.type03_链表;

import java.util.ArrayList;
import java.util.Stack;

import common.ListNode;

/**
*
* @author loveincode
* @data Dec 12, 2017 3:38:25 PM
*/
public class 从尾到头打印链表 {
	
	/**
	 * type : 链表
	*    public class ListNode {
	*        int val;
	*        ListNode next = null;
	*
	*        ListNode(int val) {
	*            this.val = val;
	*        }
	*    }
	*
	*/
	
	/**
	 * 输入一个链表，从尾到头打印链表每个节点的值。
	 */
	
	
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;      
    }
}
