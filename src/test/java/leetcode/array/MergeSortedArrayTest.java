package leetcode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static leetcode.array.MergeSortedArray.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MergeSortedArrayTest {


    static Stream<Arguments> arrayIntProvider() {
        return Stream.of(
                arguments(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3, new int[]{1, 2, 2, 3, 5, 6}),
                arguments(new int[]{1}, 1, new int[]{}, 0, new int[]{1}),
                arguments(new int[]{2, 0}, 1, new int[]{1}, 1, new int[]{1, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("arrayIntProvider")
    public void mergeTest(int[] nums1, int m, int[] nums2, int n, int[] res) {
        merge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(nums1, res);
    }

}
