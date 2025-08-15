package LeetCode.RemoveDuplicatesfromSortedArray;

import java.util.Arrays;

public class Solution {
    int[] numsField;

    public int removeDuplicates(int[] nums) {
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;

    }

    public int[] getNumsField() {
        return numsField;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
        System.out.println(Arrays.toString(solution.getNumsField()));
        ;
    }
}
