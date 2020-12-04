package algo.study.anotherversion;

import java.util.HashMap;
import java.util.Map;

/**
 * TwoSum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not user the same element twice.
 *
 * input : [2,7,11,15]      target : 9
 * output : [0,1]
 */
public class TwoSum {

    public int[] func(int[] input, int target){
        int[] result = new int[2];
        int len = input.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<len; ++i){
            int val = input[i];
            if(map.containsKey(val)){
                result[0] = map.get(val);
                result[1] = i;
            }else{
                map.put(target - val, i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();
        int[] input = {2,7,11,15};
        int[] result = twoSum.func(input, 22);

        for(int num : result){
            System.out.println(num);
        }
    }
}
