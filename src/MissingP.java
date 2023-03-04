public class MissingP {
    /*
    Given an unsorted integer array nums, return the smallest missing positive integer.
    You must implement an algorithm that runs in O(n) time and uses constant extra space.
    Source: https://leetcode.com/problems/first-missing-positive/
     */
    public int firstMissingPositive(int[] nums) {
        if(nums.length == 0) return 1;
        boolean one = false;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) one = true;
            else if (nums[i] <= 0 || nums[i] > nums.length) nums[i] = 1;
        }
        if(!one) return 1;

        for (int i = 0; i < nums.length; i++) {
            int at = Math.abs(nums[i]) -1;
            if (nums[at] > 0) nums[at] *= -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) return i+1;
        }

        return nums.length + 1;
    }
}
