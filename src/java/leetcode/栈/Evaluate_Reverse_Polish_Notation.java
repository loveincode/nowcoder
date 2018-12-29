package leetcode.栈;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {
	
	/*
	 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
	 * 用反波兰式表示算术表达式的值。
	 * Valid operators are+,-,*,/. Each operand may be an integer or another expression.
	 * 有效运算符是+，*，*。每个操作数可以是一个整数或另一个表达式。
	 * 
	 * Some examples:
	 *  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
	 *  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
	 */
	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < tokens.length; i++) {
			try {
				int num = Integer.parseInt(tokens[i]);
				stack.add(num);
			} catch (Exception e) {
				int b = stack.pop();
				int a = stack.pop();
				stack.add(get(a, b, tokens[i]));
			}
		}
		return stack.pop();
	}

	private int get(int a, int b, String operator) {
		switch (operator) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			return a / b;
		default:
			return 0;
		}
	}

}
