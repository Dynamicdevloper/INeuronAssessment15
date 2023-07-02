package in.ineuron;

public class Question8 {
	public static void main(String[] args) {
		
		int[] heights= {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trapping(heights));
	}
	
	public static int trapping(int[] heights) {
		int n=heights.length;
		int[] left=new int[n];
		int[] right=new int[n];
		int max1= Integer.MIN_VALUE;
		int max2= Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			max1=Math.max(max1, heights[i]);
			left[i]=max1;
			max2=Math.max(max2, heights[n-i-1]);
			right[n-i-1]=max2;
		}
		int ans=0;
		for(int i=0; i<n; i++) {
			ans+=Math.min(left[i], right[i])-heights[i];
		}
		return ans;
	}
}
