package algo.study.myversion;

/**
 * MoveZeros
 *Given an array nums, write a function to meve all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * input : [0,1,0,3,12]
 * output : [1,3,12,0,0]
 *
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeros {

    public int[] func(int[] arr){
        int len = arr.length;
        int index = 0;
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }
        if(index < len){
            for(; index<len; ++index){
                arr[index] = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        MoveZeros moveZeros = new MoveZeros();

        int[] input = {0,1,0,3,12};

        int[] output = moveZeros.func(input);
        for(int number : output){
            System.out.println(number);
        }
    }
}
