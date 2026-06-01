class Solution {
    public int climbStairs(int n) {
      //define the subproblem
        //let dp[k] be the number of ways you can get to k steps
      //define and eval the base cases
        //n = 0 -> ret 0; n = 1 -> ret 1
      //establish the recurrence for the tabulation
        //dp[k] = dp[k-1] + dp[k-2]
      //determine the order of the subproblem
        //left to right
      //final form of output
        //dp[n]
      //put it all together
        if (n < 2) return n;
        int[] dp = new int[n+1];
        //if (n == 0); return 0;
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++){
            dp[i] = dp[i-2] + dp[i-1];
        }
        //[0,1,2,3,5,8]

        return dp[n];
    }
}
