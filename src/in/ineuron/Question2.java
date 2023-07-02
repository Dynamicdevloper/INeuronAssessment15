package in.ineuron;

import java.util.Stack;

public class Question2 {
	
	public static void main(String[] args) {
		int[] arr= {1,6,2};
		int[] arr1= {1,5,0,3,4,5};
		int n=arr.length;
		int n1=arr1.length;
		printResult(arr, n);
		printResult(arr1, n1);
		
		
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
		for(int i=0; i<n; i++) {
			if(stack.isEmpty()) {
				result[i]=-1;
			}else if(!stack.isEmpty() && stack.peek()<arr[i]) {
				result[i]=stack.peek();
			}else if(!stack.isEmpty() && stack.peek()>=arr[i]) {
				while(!stack.isEmpty() && stack.peek()>=arr[i]) {
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
