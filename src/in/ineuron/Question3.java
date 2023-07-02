package in.ineuron;

import java.util.Stack;

public class Question3 {

	public static void main(String[] args) {
		Stack<Integer> stack= new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		deleteMiddle(stack);
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
	}
	
	public static void deleteMiddle(Stack<Integer> stack) {
		int size= stack.size();
		delMidHelper(stack, size/2, 0);
	}

	private static void delMidHelper(Stack<Integer> stack, int size,int start) {
		
		if(start>=size) {
			stack.pop();
			return;
		}
		
		int temp= stack.pop();
		delMidHelper(stack, size, start+1);
		stack.add(temp);
		
	}
}
