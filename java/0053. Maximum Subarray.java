package leetcode.java;

/**
 * Obvious implementation
 * Time complexity: O(N^2)
 * Space complexity: O(1)   
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        for (int idx1=0; idx1<nums.length; idx1++) {
            int tempSum = 0;
            for (int idx2=idx1; idx2<nums.length; idx2++) {
                tempSum += nums[idx2];
                maxSum = Math.max(maxSum, tempSum);
            }
        }
        return maxSum;
    }
}


/**
 * Efficient implementation
 * Time complexity: O(N)
 * Space complexity: O(1)   
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (currSum < 0) {
                currSum = num;
            } else {
                currSum += num;
            }
            maxSum = currSum > maxSum ? currSum : maxSum;
        }
        return maxSum;
    }
}