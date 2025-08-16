package LeetCode.TwoSum_II_InputArrayIsSorted;
/**
В основе данного решения  - метод двух указателей, сравнивается сумма двух элементов первого и последнего в массиве"numbers"
 Если сумма равна целевой - выводим решение. Если сумма двух меньше целевой, то стараемся добрать её увеличением, т.е.
 увеличить слева, т.к. справа уже максимум(Массив отсортирован и потому крайнее правое значение уже не увеличить).
 Если сумма больше целевой, значит можно уменьшить часть справа.
*/
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int twoSum = numbers[left] + numbers[right];
            if (twoSum == target) return new int[]{left + 1, right + 1};
            else if (twoSum < target) {
                left++;
            } else if (twoSum > target) {
                right--;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.twoSum(new int[]{3,2,4},6));
    }
}
