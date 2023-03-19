'''
Obvious implementation
Time complexity: O(N^2)
Space complexity: O(N)
'''
class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        while "[]" in s or "{}" in s or "()" in s:
            s = s.replace("[]", "")
            s = s.replace("{}", "")
            s = s.replace("()", "")

        return len(s) == 0

'''
Efficient implementation
Time complexity: O(N)
Space complexity: O(N)
'''
class Solution(object):
    def isValid(self, s):
        opening = ['(', '{', '[']

        stack = []

        for bracket in s:
            if bracket in opening:
                stack.append(bracket)
            else:
                if len(stack) == 0:
                    return False
                brack = stack.pop()
                if bracket == ')' and brack != '(':
                    return False
                elif bracket == '}' and brack != '{':
                    return False
                elif bracket == ']' and brack != '[':
                    return False
        
        return len(stack) == 0