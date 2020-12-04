package algo.study.myversion;

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

        boolean flag = false;
        for(int i = 0; i<len; ++i){
            for(int j = i+1; j<len; ++j){
                if(input[i] + input[j] == target){
                    result[0] = i;
                    result[1] = j;
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
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
