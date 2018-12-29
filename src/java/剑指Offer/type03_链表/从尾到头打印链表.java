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
	
	
	
	/*
	 * 
	 * 遍历反转法：递归反转法是从后往前逆序反转指针域的指向，而遍历反转法是从前往后反转各个结点的指针域的指向。
   	       基本思路是：将当前节点cur的下一个节点 cur.getNext()缓存到temp后，然后更改当前节点指针指向上一结点pre。
   	       也就是说在反转当前结点指针指向前，先把当前结点的指针域用tmp临时保存，以便下一次使用，其过程可表示如下：
	   pre：上一结点
	   cur: 当前结点
	   tmp: 临时结点，用于保存当前结点的指针域（即下一结点）
	 * 
	 * 
	 */
}
