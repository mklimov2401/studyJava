package typedata.numbers.systems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static base.typedata.numbers.systems.NumberSystem.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNumberSystem {
//
    @ParameterizedTest
    @CsvSource({"15,1111", "0,0", "100,1100100", "10,1010"})
    public void testDecimalToBinary(int n, int actual) {
        assertEquals(decimalToBinary(n), actual);
        assertEquals(converterNumSys(String.valueOf(n), 10, 2), String.valueOf(actual));
    }

    @ParameterizedTest
    @CsvSource({"1111,15", "0,0", "1100100,100", "1010,10"})
    public void testBinaryToDecimal(int n, int actual) {
        assertEquals(binaryToDecimal(n), actual);
        assertEquals(converterNumSys(String.valueOf(n), 2, 10), String.valueOf(actual));
    }

    @ParameterizedTest
    @CsvSource({"10,12", "0,0", "1,1", "1000,1750", "99,143"})
    public void testDecimalToOctal(int n, int actual) {
        assertEquals(decimalToOctal(n), actual);
        assertEquals(converterNumSys(String.valueOf(n), 10, 8), String.valueOf(actual));
    }

    @ParameterizedTest
    @CsvSource({"12,10", "0,0", "1,1", "1750,1000", "143,99"})
    public void testOctalToDecimal(int n, int actual) {
        assertEquals(octalToDecimal(n), actual);
        assertEquals(converterNumSys(String.valueOf(n), 8, 10), String.valueOf(actual));
    }

    @ParameterizedTest
    @CsvSource({"1000,3E8", "0,0", "1,1", "5,5", "15,F", "150,96", "10,A"})
    public void testDecimalToHexadecimal(int n, String actual) {
        assertEquals(decimalToHexadecimal(n), actual);
        assertEquals(converterNumSys(String.valueOf(n), 10, 16), String.valueOf(actual));
    }

    @ParameterizedTest
    @CsvSource({"3E8,1000", "0,0", "1,1", "5,5", "F,15", "96,150", "A,10"})
    public void testHexadecimalToDecimal(String n, String actual) {
        assertEquals(hexadecimalToDecimal(n), actual);
        assertEquals(converterNumSys(n, 16, 10), String.valueOf(actual));
    }

    @ParameterizedTest
    @CsvSource({"1111,1111,2,2","1111,17,2,8","105,410,10,5","410,105,5,10","410,1101001,5,2",
    "1101001,63,2,17"})
    public void mConvert(String n, String actual, int fromBase, int toBase) {
        assertEquals(converterNumSys(n, fromBase, toBase), String.valueOf(actual));
    }
}
