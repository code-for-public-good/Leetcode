'''
Obvious implementation
Time complexity: O(N^2)
Space complexity: O(1)
'''
class Solution(object):
    def maxSubArray(self, nums):
        maxSum = nums[0]
        
        for idx1 in range(len(nums)):
            tempSum = 0
            for idx2 in range(idx1, len(nums)):
                tempSum += nums[idx2]
                maxSum = max(maxSum, tempSum)
        
        return maxSum


'''
Efficient implementation
Time complexity: O(N)
Space complexity: O(1)
'''
class Solution(object):
    def maxSubArray(self, nums):
        curr_sum = 0
        maximum = -99999

        for num in nums:
            if curr_sum < 0:
                curr_sum = num
            else:
                curr_sum += num
            maximum = max(maximum, curr_sum)
        return maximum