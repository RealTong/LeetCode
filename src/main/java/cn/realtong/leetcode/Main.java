package cn.realtong.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        int n = 15;
//        List<String> strings = fizzBuzz(n);
//        System.out.println(strings);
        int[] nums = {2,5,5,11};
        int target = 10;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums,int target){
        int[] result = new int[2];
        for (int i=0;i<nums.length; i++){
            int n = nums[i];
            result[0] = i;
            int min = target - n;
            for (int j =1; j<nums.length;j++){
                if (j==i){
                    continue;
                }
                if (min ==nums[j]){
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static List<String> fizzBuzz(int n) {
        List<String> strList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                strList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                strList.add("Fizz");
            } else if (i % 5 == 0) {
                strList.add("Buzz");
            } else {
                strList.add(String.valueOf(i));
            }
        }
        return strList;
    }
}