package leetcode.java;

import java.util.HashMap;

/**
 * Obvious implementation
 * Time complexity: O(NlogN)
 * Space complexity: O(1)   
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_arr = s.toCharArray();
        Arrays.sort(s_arr);

        char[] t_arr = t.toCharArray();
        Arrays.sort(t_arr);

        return Arrays.equals(s_arr, t_arr);
    }
}


/**
 * Efficient implementation
 * Time complexity: O(N)
 * Space complexity: O(1)   
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Character c2 : t.toCharArray()) {
            if (map.containsKey(c2)) {
                if (map.get(c2) == 1) {
                    map.remove(c2);
                } else {
                    map.put(c2, map.get(c2) - 1);
                }
            } else {
                return false;
            }
        }

        return map.size() == 0;
    }
}