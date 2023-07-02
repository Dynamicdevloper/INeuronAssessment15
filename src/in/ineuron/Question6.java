package in.ineuron;

import java.util.Stack;

public class Question6 {

	public static void main(String[] args) {
		System.out.println(evaluatePostfix("231*+9-"));
	}
	
	   public static int evaluatePostfix(String expression) {
	        Stack<Integer> stack = new Stack<>();
	        for (char ch : expression.toCharArray()) {
	            if (Character.isDigit(ch)) {
	                stack.push(Character.getNumericValue(ch));
	            } else {
	                int operand2 = stack.pop();
	                int operand1 = stack.pop();
	                int result = 0;
	                switch (ch) {
	                    case '+':
	                        result = operand1 + operand2;
	                        break;
	                    case '-':
	                        result = operand1 - operand2;
	                        break;
	                    case '*':
	                        result = operand1 * operand2;
	                        break;
	                    case '/':
	                        result = operand1 / operand2;
	                        break;
	                }
	                stack.push(result);
	            }
	        }
	        return stack.pop();
	    }
}
