package leetcode.array;

import java.util.Arrays;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <p>
 * The final sorted array should not be returned by the function, but instead be stored
 * inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first
 * m elements denote the elements that should be merged, and the last n elements are set
 * to 0 and should be ignored. nums2 has a length of n.
 */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int posNum1 = 0, posNum2 = 0;
        int[] res = new int[n + m];
        if (n == 0) return;
        while (posNum1 < m | posNum2 < n) {
            if (posNum1 == m) {
                res[posNum1 + posNum2] = nums2[posNum2];
                posNum2++;
            } else if (posNum2 == n) {
                res[posNum1 + posNum2] = nums1[posNum1];
                posNum1++;
            } else {
                if (nums1[posNum1] < nums2[posNum2]) {
                    res[posNum1 + posNum2] = nums1[posNum1];
                    posNum1++;
                } else {
                    res[posNum1 + posNum2] = nums2[posNum2];
                    posNum2++;
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            nums1[i] = res[i];
        }
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int posNum1 = 0, posNum2 = 0;
        int[] res = new int[n + m];
        if (nums2.length == 0) return;
        while (posNum1 < m || posNum2 < n) {
            if (posNum1 == m) {
                res[posNum1 + posNum2] = nums2[posNum2];
                posNum2++;
            } else if (posNum2 == n) {
                res[posNum1 + posNum2] = nums1[posNum1];
                posNum1++;
            } else {
                if (nums1[posNum1] < nums2[posNum2]) {
                    res[posNum1 + posNum2] = nums1[posNum1];
                    posNum1++;
                } else {
                    res[posNum1 + posNum2] = nums2[posNum2];
                    posNum2++;
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            nums1[i] = res[i];
        }
    }
}
