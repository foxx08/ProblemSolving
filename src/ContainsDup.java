import java.util.HashSet;
import java.util.Set;

public class ContainsDup {
    /*
    Given an integer array nums,
    return true if any value appears at least twice in the array,
    and return false if every element is distinct.
     */

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;
    }
}
