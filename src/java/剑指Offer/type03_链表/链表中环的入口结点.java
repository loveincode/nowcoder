package 剑指Offer.type03_链表;

import common.ListNode;

public class 链表中环的入口结点 {
	/*
	 * 一个链表中包含环，请找出该链表的环的入口结点。
	 */
	
	/*
	 * 如果链表中环 有n个结点，指针P1在链表上向前移动n步，然后两个指针以相同的速度向前移动。
 		当第二个指针指向环的入口结点时，第一个指针已经围绕着环走了一圈又回到了入口结点。
		所以首先要得到环中结点的数目。
	 */
	
	//找到一快一满指针相遇处的节点，相遇的节点一定是在环中
    public static ListNode meetingNode(ListNode head) {
        if(head==null)
            return null;
         
        ListNode slow = head.next;
        if(slow==null)
            return null;
         
        ListNode fast = slow.next;
        while (slow != null && fast != null) {
            if(slow==fast){
                return fast;
            }
            slow=slow.next;
            fast=fast.next;
             
            if(fast!=slow){
                fast=fast.next;
            }
        }
        return null;
    }
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode meetingNode=meetingNode(pHead);
        if(meetingNode==null)
            return null;
//      得到环中的节点个数
        int nodesInLoop=1;
        ListNode p1=meetingNode;
        while(p1.next!=meetingNode){
            p1=p1.next;
            ++nodesInLoop;
        }
//      移动p1
        p1=pHead;
        for(int i=0;i<nodesInLoop;i++){
            p1=p1.next;
        }
//      移动p1，p2
        ListNode p2=pHead;
        while(p1!=p2){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
    }
}
