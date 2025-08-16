package LeetCode.twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * 1 попытка
     */

    public int[] twoSum(int[] numbers, int target) {
        int twoSum;
        for (int left = 0; left < numbers.length; left++) {
            for (int right = numbers.length - 1; right > left; right--) {
                if (numbers[left] + numbers[right] == target) {
                    return new int[]{left, right};
                } else continue;
            }
        }
        return null;
    }

    /**
     * 2 попытка
     * Поиск как по обычному отсортированному массиву с дальнейшим поиском исходных индексов
     */
     public int[] twoSum2(int[] nums, int target) {
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);
        int left = 0;
        int right = sortedNums.length - 1;
        while (left < right) {
            int sum = sortedNums[left] + sortedNums[right];
            if (sum == target) {
                // Find the original indices
                int index1 = -1, index2 = -1;
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == sortedNums[left] && index1 == -1) {
                        index1 = i;
                    } else if (nums[i] == sortedNums[right]) {
                        index2 = i;
                    }
                }
                return new int[]{index1, index2};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1}; // This line is theoretically unreachable due to the problem's constraints
    }
    /**
     * Добавляем хэшмапу, ищем величину комплемент, равную разнице текущего элемента и целевой суммы.
     * Таким образом находим величину, которая нам нужна. Добавляем каждый элемент в МАПУ. Так мы определяем, что такой
     * элемент существует и если он уже находится в мапе, тогда возвращаем пару из текущего элемента и того,
     * сумма с которым даст нужное число target
     * */
    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{-1, -1}; // This line is theoretically unreachable due to the problem's constraints
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum3(new int[]{1, 3, 2, 4}, 6)));
    }
}
