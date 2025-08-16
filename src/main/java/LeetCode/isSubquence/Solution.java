package LeetCode.isSubquence;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        int pointer1 = 0;

        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        if (s.isEmpty()) {
            return true;
        }

        if (t.isEmpty()) {
            return false;
        }

        for (int i = 0; i < chars2.length && pointer1 < chars1.length; i++) {
            if (chars2[i] == chars1[pointer1]) {
                pointer1++;
            }
        }
        return pointer1 == chars1.length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isSubsequence("", "ahbgdc"));

    }
}
