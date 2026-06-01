class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> nums_smth = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int num = nums[i];
            int x = target - num;

            if (nums_smth.containsKey(x)){
                return new int [] {nums_smth.get(x), i};
            }

            nums_smth.put(num, i);
        }
        return new int[] {};
    }
}
