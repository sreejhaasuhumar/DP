package DP;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ans=climbStairs(7);
		System.out.println(ans);
	}

	 public static int climbStairs(int n) {
		 int[] dp=new int[n+1];
	        dp[1]=1;
	        dp[0]=1;
	        if(n==1)
	           return n;
	        for(int i=2;i<=n;i++)
	        {
	            dp[i]=dp[i-1]+dp[i-2];
	        }
	        
	        return dp[n];
	    }
}
