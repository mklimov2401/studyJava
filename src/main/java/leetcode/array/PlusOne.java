package leetcode.array;


import java.util.Arrays;

/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 * <p>
 * Increment the large integer by one and return the resulting array of digits.
 */
public class PlusOne {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] ints = new int[digits.length + 1];
        ints[0]++;
        return ints;
    }

    public static int[] plusOneV2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == 0 && digits[i] + 1 == 10) {
                int[] ints = new int[digits.length + 1];
                ints[0] = 1;
                return ints;
            }
            if (digits[i] + 1 != 10) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        return digits;
    }
}
