package in.ineuron;

import java.util.Stack;

public class Question4 {

	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s);
		reverse(s);
		System.out.println(s);
		
		
		
		
	}
	
	public static void reverse(Stack<Integer> stack){
		
		if(stack.isEmpty()) return;
		int first= stack.pop();
		reverse(stack);
		reverseHelper(stack,first);
	}

	private static void reverseHelper(Stack<Integer> stack,int first) {
		if(stack.isEmpty()) {
			stack.push(first);
			return;
		}
		int i= stack.pop();
		reverseHelper(stack,first);
		stack.add(i);
	}
}
