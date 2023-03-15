package leetcode.java;

import java.util.HashSet;

/**
 * Obvious implementation
 * Time complexity: O(N^2)
 * Space complexity: O(1)   
 */
class Solution {
    public static boolean containsDuplicate(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}



/**
 * Efficient implementation
 * Time complexity: O(N)
 * Space complexity: O(N)   
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }
}