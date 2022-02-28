package malehunter.datastructure.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author congpeitong
 * @date 2022-02-28 15:02
 * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
 */
public class LeetCode217 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num,1);
            } else {
               map.put(num,map.get(num) + 1);
            }
        }
        for (Integer value: map.values()) {
            if (value>1) {
                return true;
            }
        }
        return false;
    }
    public boolean containsDuplicate1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length-1) {
                if (nums[i] == nums[i+1]) {
                    return true;
                }
            }
        }
        return false;
    }
}
