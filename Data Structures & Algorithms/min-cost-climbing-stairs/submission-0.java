class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //define sub:
            //let dp[k] be the min cost to reach step k
        //base case:
            //n == 0 return 0
            //n == 1 return 1
        //recurrence:
            //base: either 0 or 1 or 2
                // choose the min of both
            //dp[k] = Math.min(dp[k-1]+cost[k-1],dp[k-2]+cost[k-2])
        //out:
            //dp[n]
        int n = cost.length;
        //initialising the dp array
        int []dp = new int[n+1];
        if (n==0) return 0;
        if (n==1) return cost[0];

        //base cases
        dp[1] = cost[0];
        dp[2] = Math.min(cost[0],cost[1]);
        dp[3] = Math.min(cost[1],cost[2]);

        for (int i = 4; i <= n; i++){
            dp[i] = Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        
        return dp[n];
    }//dp[0,1,1,3]
    //dp[]
}
