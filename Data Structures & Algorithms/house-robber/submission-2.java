class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int []c = new int [n+1];
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        c[0] = nums[0];
        c[1] = Math.max(nums[0],nums[1]);

        for (int i = 2; i < n; i++){
            int IN = nums[i] + c[i-2];
            int OUT = c[i-1];
            c[i] = Math.max(IN,OUT);
        }

        return c[n-1];
    }//[0,1,1,]
}
