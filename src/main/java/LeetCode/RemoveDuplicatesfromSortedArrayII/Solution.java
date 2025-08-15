package LeetCode.RemoveDuplicatesfromSortedArrayII;

public class Solution {
    public int removeDublicates(int[] nums) {

        int k = 1;
        int counter = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[k-1]) counter++;

            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;


    }
}
// идем с элемента индекс = 1 и счетчика 1
// если элемент равен предыдущему (попробуем с индексом к) увеличиваем counter++ , тогда проверяем счетчик
//
// [1,1,1,2,2,3]'''
