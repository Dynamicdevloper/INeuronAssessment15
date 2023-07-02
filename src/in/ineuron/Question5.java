package in.ineuron;

import java.util.Stack;

public class Question5 {

public static void main(String[] args) {
		
		Stack<Character> s=new Stack<>();
		
		String str= "geeksforgeekshelper";
		for(int i=0; i<str.length(); i++) s.push(str.charAt(i));
		
		System.out.println(s);
		String ans="";
		for(Character c: s)
			ans+=""+c;
		System.out.println(ans);
		
		String ans1="";
		reverse(s);
		for(Character c: s)
			ans1+=""+c;
		System.out.println(ans1);
		
		
		
		
	}
	
	public static void reverse(Stack<Character> stack){
		
		if(stack.isEmpty()) return;
		char first= stack.pop();
		reverse(stack);
		reverseHelper(stack,first);
	}

	private static void reverseHelper(Stack<Character> stack,char first) {
		if(stack.isEmpty()) {
			stack.push(first);
			return;
		}
		char i= stack.pop();
		reverseHelper(stack,first);
		stack.add(i);
	}
}
