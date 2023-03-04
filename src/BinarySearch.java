public class BinarySearch {
    /*
    Given an array of integers nums which is sorted in ascending order,
    and an integer target, write a function to search target in nums.
    If target exists, then return its index. Otherwise, return -1.
    You must write an algorithm with O(log n) runtime complexity.
    Source: https://leetcode.com/problems/binary-search/
     */
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        while (l <= r) {
            int m = (l+r) / 2;
            //m = l + ((r-l)) /2) <- in case of overflow if values are close to 2^31
            if(nums[m] > target) {
                r = m - 1;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
