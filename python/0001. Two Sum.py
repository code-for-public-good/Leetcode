'''
Obvious implementation
# Time complexity: O(N^2)
# Space complexity: O(1)
'''
class Solution(object):
    def twoSum(self, nums, target):
        for idx in range(len(nums)):
            for idx2 in range(idx+1, len(nums)):
                if nums[idx] + nums[idx2] == target:
                    return [idx, idx2]


'''
Efficient implementation
# Time complexity: O(N)
# Space complexity: O(N)
'''
class Solution(object):
    def twoSum(self, nums, target):
        storage = {}
        
        for idx, num in enumerate(nums):
            remainder = target - num
            if remainder in storage:
                return [idx, storage[remainder]]
            else:
                storage[num] = idx
        return []