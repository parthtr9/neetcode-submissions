class Solution {
    public int missingNumber(int[] nums) {
        int n = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != n){
                return n;
            }
            n++;
        }
        return n;
    }
}
