package in.ineuron;

import java.util.Stack;

public class Question1 {
	public static void main(String[] args) {
		int[] arr= {1,3,2,4};
		int[] arr1= {6,8,0,1,3};
		int n=arr.length;
		int n1=arr1.length;
		printResult(arr1, n1);
		printResult(arr, n);
		
		
	}
	
	private static void printResult(int[] arr,int n) {
		int[] result=nextGreater(arr,n);
		for(int val: result) {
			System.out.print(val+" ");
		}
		System.out.println();
	}

	private static int[] nextGreater(int[] arr, int n) {
		int[] result=new int[n];
		Stack<Integer> stack=new Stack<>();
		for(int i=n-1; i>=0; i--) {
			if(stack.isEmpty()) {
				result[i]=-1;
			}else if(!stack.isEmpty() && stack.peek()>arr[i]) {
				result[i]=stack.peek();
			}else if(!stack.isEmpty() && stack.peek()<=arr[i]) {
				while(!stack.isEmpty() && stack.peek()<=arr[i]) {
					stack.pop();
				}
				
				if(stack.isEmpty()) result[i]=-1;
				else result[i]=stack.peek();
			}
			stack.add(arr[i]);
		}
		return result;
	}
}
