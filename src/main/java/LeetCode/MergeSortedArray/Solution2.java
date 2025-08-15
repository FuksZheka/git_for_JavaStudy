package LeetCode.MergeSortedArray;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> mergedList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            mergedList.add(nums1[i]);
        }
        for (int j = 0; j < n; j++) {
            mergedList.add(nums2[j]);
        }
        mergedList = mergedList.stream().sorted().toList();
        nums1 =mergedList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        solution.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);

    }
}
