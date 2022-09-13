package algoritm;

import base.algoritm.BinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static base.algoritm.BinarySearch.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BinarySearchTest {

    static Stream<Arguments> arrayProvider() {
        return Stream.of(
                arguments(new int[]{1, 3}, 3),
                arguments(new int[]{1}, 1),
                arguments(new int[]{1, 3, 5, 6}, 3),
                arguments(new int[]{1, 3, 5, 6}, 2),
                arguments(new int[]{1, 5, 6, 8, 9}, 7),
                arguments(new int[]{1, 3, 5, 6, 7, 8, 23, 44, 66, 67, 78, 88, 89, 99, 100}, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("arrayProvider")
    public void binarySearchTest(int[] nums, int key) {
        assertEquals(binarySearch(nums, key), Arrays.binarySearch(nums, key));
    }
}
