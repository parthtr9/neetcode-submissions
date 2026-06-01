class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int sumnums = 0;
        for (int i = 0; i < nums.length + 1; i++){
            sum += i;
        }
        for (int i = 0; i < nums.length; i++){
            sumnums += nums[i];
        }
        return Math.abs(sumnums - sum);
    }
}
