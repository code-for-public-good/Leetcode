package leetcode.java;

import java.util.Stack;

/**
 * Obvious implementation
 * Time complexity: O(N^2)
 * Space complexity: O(N)   
 */
class Solution {
    public boolean isValid(String s) {
        while (s.contains("{}") || s.contains("()") || s.contains("[]")) {
            s = s.replace("{}", "");
            s = s.replace("[]", "");
            s = s.replace("()", "");
        }
        return s.length() == 0;
    }
}


/**
 * Efficient implementation
 * Time complexity: O(N)
 * Space complexity: O(N)   
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack =  new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.add(c);
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                char temp = stack.pop();
                if (temp == '(' && c != ')') {
                    return false;
                } else if (temp == '{' && c != '}') {
                    return false;
                } else if (temp == '[' && c != ']') {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
}