package doublepoint.solution167;
/**
 * 题目：
 * 在有序数组中找出两个数，使它们的和为 target。
 * <p>
 * 思路：
 * 使用双指针，一个指针指向值较小的元素，一个指针指向值较大的元素。
 * 指向较小元素的指针从头向尾遍历，指向较大元素的指针从尾向头遍历。
 * 如果两个指针指向元素的和 sum == target，那么得到要求的结果；
 * 如果 sum > target，移动较大的元素，使 sum 变小一些；
 * 如果 sum < target，移动较小的元素，使 sum 变大一些。
 */
/**
 * 思路：
 * 使用双指针，一个指针指向值较小的元素，一个指针指向值较大的元素。
 * 指向较小元素的指针从头向尾遍历，指向较大元素的指针从尾向头遍历。
 * 如果两个指针指向元素的和 sum == target，那么得到要求的结果；
 * 如果 sum > target，移动较大的元素，使 sum 变小一些；
 * 如果 sum < target，移动较小的元素，使 sum 变大一些。
 */

import java.util.HashMap;

public class TwoSum {
    //自己的方法
    public int[] twoSum1(int[] numbers, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> IndexMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            IndexMap.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length / 2 + 1; i++) {
            int retain = target - numbers[i];
            if (IndexMap.containsKey(retain)) {
                result[0] = i + 1;
                result[1] = IndexMap.get(retain) + 1;
                return result;
            }
        }
        return result;
    }

    //使用双指针的方法
    public int[] twoSum2(int[] numbers, int target) {
        int point1 = 0;
        int point2 = numbers.length - 1;
        while (point1 < point2) {
            int sum = numbers[point1] + numbers[point2];
            if (sum < target) {
                point1++;
            } else if (sum > target) {
                point2--;
            } else {
                return new int[]{point1 + 1, point2 + 1};
            }
        }
        return null;
    }
}
