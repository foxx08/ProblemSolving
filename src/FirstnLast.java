public class FirstnLast {
    /*
    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    Given an array of integers nums sorted in non-decreasing order,
    find the starting and ending position of a given target value.
    If target is not found in the array, return [-1, -1].
    You must write an algorithm with O(log n) runtime complexity.
     */

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[] {-1, -1};
        boolean once = true;
        if(nums.length == 0 ) return result;

        for (int i = 0; i < nums.length; i++ ) {
            if(nums[i] == target && once) {
                result[0] = i;
                once = false;
            }
            if(result[0] != -1) {
                if(nums[i] == target) result[1] = i;
            }
        }
        return result;
    }
}
