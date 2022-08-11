public class MajorityElement {
    /*
    Given an array nums of size n, return the majority element.
    The majority element is the element that appears more than [n / 2] times.
    You may assume that the majority element always exists in the array.
     */
    public int majorityElement(int[] nums) {
        for(int num : nums) {
            int count = 0;
            for(int compare : nums) {
                if(num == compare) {
                    count++;
                }
            }
            if(count > nums.length / 2) return num;
        }
            return -1;
    }
}

/*
 int element = 0, count = 0, j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[j] == nums[i]) {
                count++;
            }
            if(i == nums.length-1) {
                if(count > nums.length / 2) element = nums[j];
                else {
                    count = 0;
                    j++;
                    i = 0;
                }
            }
        }
        return element;
 */

//both Time Limit Exceeded