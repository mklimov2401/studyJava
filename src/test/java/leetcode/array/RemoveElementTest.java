package leetcode.array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static leetcode.array.RemoveElement.removeElement;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RemoveElementTest {


    @Test
    public void removeElementTest() {
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        int[] expectedNums = new int[]{2, 2};
        int k = removeElement(nums, val);
        assertEquals(k, expectedNums.length);
        Arrays.sort(nums, 0, k);
        for (int i = 0; i < k; i++) {
            assertEquals(nums[i], expectedNums[i]);
        }
    }


    static Stream<Arguments> arraysIntProvider() {
        return Stream.of(
                arguments(new int[]{3, 2, 2, 3}, new int[]{2, 2}, 3),
                arguments(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, new int[]{0, 0, 1, 3, 4}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("arraysIntProvider")
    public void removeElementTest(int[] actual, int[] expect, int v) {
        int[] nums = actual;
        int val = v;
        int[] expectedNums = expect;
        int k = removeElement(nums, val);
        assertEquals(k, expectedNums.length);
        Arrays.sort(nums, 0, k);
        for (int i = 0; i < k; i++) {
            assertEquals(nums[i], expectedNums[i]);
        }
    }

}
