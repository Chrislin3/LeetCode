package doublepoint.solution167;

import java.util.HashMap;

public class TwoSum {
    //自己的方法
    public int[] twoSum1(int[] numbers, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> IndexMap = new HashMap<>();
        for(int i = 0;i<numbers.length;i++){
            IndexMap.put(numbers[i],i);
        }
        for(int i = 0;i<numbers.length/2 + 1;i++){
            int retain = target - numbers[i];
            if(IndexMap.containsKey(retain)){
                result[0] = i+1;
                result[1] = IndexMap.get(retain)+1;
                return result;
            }
        }
        return result;
    }
    //使用双指针的方法
    public int[] twoSum2(int[] numbers, int target){
        int point1 = 0;
        int point2 = numbers.length - 1;
        while (point1 < point2){
            int sum = numbers[point1] + numbers[point2];
            if(sum < target){
                point1 ++ ;
            }
            else if(sum > target) {
                point2 --;
            }
            else {
                return new int[] {point1 + 1,point2 + 1};
            }
        }
        return null;
    }
}
