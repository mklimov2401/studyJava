package leetcode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static leetcode.array.PlusOne.*;
import static org.junit.jupiter.api.Assertions.*;

public class PlusOneTest {
    @Test
    public void testPlusOne() {
        assertAll(
                () -> assertArrayEquals(plusOne(new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6}),
                        new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 7}),
                () -> assertArrayEquals(plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}), new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 1}),
                () -> assertArrayEquals(plusOne(new int[]{1, 2, 3}), new int[]{1, 2, 4}),
                () -> assertArrayEquals(plusOne(new int[]{4, 3, 2, 1}), new int[]{4, 3, 2, 2}),
                () -> assertArrayEquals(plusOne(new int[]{8, 9, 9, 9}), new int[]{9, 0, 0, 0}),
                () -> assertArrayEquals(plusOne(new int[]{9, 9}), new int[]{1, 0, 0}),
                () -> assertArrayEquals(plusOne(new int[]{9}), new int[]{1, 0}));
    }
}
