'''
Obvious implementation
Time complexity: O(N^2)
Space complexity: O(1)
'''
class Solution(object):
    def containsDuplicate(self, nums):
        for idx in range(len(nums)):
            for idx2 in range(idx+1, len(nums)):
                if nums[idx] == nums[idx2]:
                    return True
        return False    


'''
Efficient implementation
Time complexity: O(N)
Space complexity: O(N)
'''
class Solution(object):
    def containsDuplicate(self, nums):
        storage = set()        
        for num in nums:
            if num in storage:
                return True
            else:
                storage.add(num)
        return False      