public class Leet {
    public static void main(String[] args) {
        Leet l = new Leet();
        int[] nums = new int[] {55,22,33,2,1};
        l.twoSum(nums, 3);

    /*Two Sum
    Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
     */
    }
    public  int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        int index = 0;
        int i = 1;
        while(i <= nums.length-1) {
            if(nums[index] + nums[i] == target) {
                sum = new int[] {index, i};
            }
            i++;
            if(i == nums.length) {
                i = index + 1;
                i+=1;
                index+=1;
            }
        }
        return sum;
        }
    }