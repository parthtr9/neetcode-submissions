class Solution {
    public int search(int[] nums, int target) {
      int max = nums.length - 1;
      int min = 0;
      
      while (max >= min){
        int mid = (max + min)/2;

        if (target > nums[mid]){
            min = mid + 1;
        }else if (target < nums[mid]){
            max = mid - 1;
        }else if (target == nums[mid]){
            return mid;
        }
      }
      return -1;

    }
}
