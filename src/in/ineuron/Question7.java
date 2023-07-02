package in.ineuron;

import java.util.Stack;

public class Question7 {

	public static void main(String[] args) {
		MinStack st=new MinStack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(-1);
		st.push(5);
		st.push(6);
		st.push(7);
		
		
		System.out.println(st.getMin());
		st.push(20);
	}
}

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);

        // update the minimum stack
        
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            int poppedVal = stack.pop();

            // remove the corresponding minimum value from the min stack
            if (poppedVal == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}