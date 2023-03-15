package leetcode.java;

import java.util.HashMap;

/**
 * Obvious implementation
 * Time complexity: O(N^2)
 * Space complexity: O(1)   
 */
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}


/**
 * Efficient implementation
 * Time complexity: O(N)
 * Space complexity: O(N)   
 */
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int remainder = target - nums[i];
            if (map.containsKey(remainder)) {
                return new int[]{i, map.get(remainder)};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}