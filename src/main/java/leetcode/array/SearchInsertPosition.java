package leetcode.array;

import java.util.Arrays;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class SearchInsertPosition {


    public static int searchInsert(int[] nums, int target) {
        int i = Arrays.binarySearch(nums, target);
        return i < 0 ? -1 - i : i;
    }

    public static int searchInsertV2(int[] nums, int target) {
        int min = 0, max = nums.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            int midVal = nums[mid];
            if (midVal < target)
                min = mid + 1;
            else if (midVal > target)
                max = mid - 1;
            else
                return mid; // key found
        }
        return min;  // key not found.
    }
}
