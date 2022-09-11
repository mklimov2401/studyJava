package leetcode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static leetcode.array.SearchInsertPosition.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

public class SearchInsertPositionTest {

    static Stream<Arguments> arrayIntProvider() {
        return Stream.of(
                arguments(new int[]{1, 3}, 1, 0),
                arguments(new int[]{1}, 1, 0),
                arguments(new int[]{1}, 2, 1),
                arguments(new int[]{1, 3, 5, 6}, 5, 2),
                arguments(new int[]{1, 3, 5, 6}, 2, 1),
                arguments(new int[]{1, 5, 6, 8, 9}, 3, 1),
                arguments(new int[]{1, 3, 5, 6}, 7, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("arrayIntProvider")
    public void searchInsertTest(int[] nums, int target, int res) {
        assertEquals(searchInsert(nums, target), res);
    }

    @ParameterizedTest
    @MethodSource("arrayIntProvider")
    public void searchInsertTestV2(int[] nums, int target, int res) {
        assertEquals(searchInsertV2(nums, target), res);
    }
}
