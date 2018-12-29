package 剑指Offer.type04_栈和队列;

import java.util.Stack;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

/**
*
* @author loveincode
* @data Dec 12, 2017 4:05:23 PM
*/
public class 用两个栈实现队列 {
	
	/**
	 * type :  栈和队列
	 * 
	 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
	 */
	
	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();
    
    public static void push(int node) {
    	stack1.push(node);
    }
    
    public static int pop() {
    	int s = 0;
    	stack2.clear();
    	while(!stack1.isEmpty()) {
    		stack2.push(stack1.pop());
        }
    	if(!stack2.isEmpty()) {
    		s = stack2.peek();
    		stack2.pop();
    	}
    	while (!stack2.isEmpty()) {
    		stack1.push(stack2.pop());
    	}
    	return s;
    }
    
    public static void main(String[] args) {
    	push(1);
    	push(2);
    	push(3);
    	System.out.println(pop());
    	System.out.println(pop());
    	push(4);
    	System.out.println(pop());
    	push(5);
    	System.out.println(pop());
    	System.out.println(pop());
    	
    	
    }
	
}
