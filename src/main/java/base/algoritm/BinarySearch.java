package base.algoritm;

public class BinarySearch {

    public static int binarySearch(int[] nums, int key) {
        int min = 0, max = nums.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            int midVal = nums[mid];
            if (midVal == key) return mid;
            if (midVal > key) {
                max = mid - 1;
            } else if (midVal < key) {
                min = mid + 1;
            }
        }
        return -min - 1;
    }
}
