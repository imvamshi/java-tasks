package com.rv.t7;

import java.util.Arrays;

public class T7_10 {
    public static int[] findClosestToZero(int[] arr) {
        int[] result = new int[2];
        if (arr.length < 2) {
            return result;
        }
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int minSum = Integer.MAX_VALUE;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                result[0] = arr[left];
                result[1] = arr[right];
            }
            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // Pair sum closest to zero
        int[] arr = {-3, 1, 6, -2, 9, -4};
        int[] result = findClosestToZero(arr);
        System.out.println(result[0] + ", " + result[1]);
    }
}
