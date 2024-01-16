import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerToRomanNumberTest {

    @Test
    public void testConvertIntegerToRomanNumberFor3() {
        assertEquals("III", IntegerToRomanNumber.convertIntegerToRomanNumber(3));
    }

    @Test
    public void testConvertIntegerToRomanNumberFor58() {
        assertEquals("LVIII", IntegerToRomanNumber.convertIntegerToRomanNumber(58));
    }

    @Test
    public void testConvertIntegerToRomanNumberFor1994() {
        assertEquals("MCMXCIV", IntegerToRomanNumber.convertIntegerToRomanNumber(1994));
    }

    @Test
    public void testConvertIntegerToRomanNumberWithZero() {
        assertEquals("Error: No conversion for 0", IntegerToRomanNumber.convertIntegerToRomanNumber(0));
    }

    @Test
    public void testConvertIntegerToRomanNumberWithNegative() {
        assertEquals("Error: Negative input", IntegerToRomanNumber.convertIntegerToRomanNumber(-10));
    }

    @Test
    public void testConvertIntegerToRomanNumberWithMaxValue() {
        assertEquals("MMMCMXCIX", IntegerToRomanNumber.convertIntegerToRomanNumber(3999));
    }

    @Test
    public void testConvertIntegerToRomanNumberOutOfRange() {
        assertEquals("Error: Number out of range", IntegerToRomanNumber.convertIntegerToRomanNumber(4000));
    }

    @Test
    public void testConvertIntegerToRomanNumberFor1() {
        assertEquals("I", IntegerToRomanNumber.convertIntegerToRomanNumber(1));
    }

    @Test
    public void testConvertIntegerToRomanNumberFor4() {
        assertEquals("IV", IntegerToRomanNumber.convertIntegerToRomanNumber(4));
    }

    @Test
    public void testConvertIntegerToRomanNumberFor5() {
        assertEquals("V", IntegerToRomanNumber.convertIntegerToRomanNumber(5));
    }

    @Test
    public void testConvertIntegerToRomanNumberFor9() {
        assertEquals("IX", IntegerToRomanNumber.convertIntegerToRomanNumber(9));
    }

    @Test
    public void testConvertIntegerToRomanNumberFor10() {
        assertEquals("X", IntegerToRomanNumber.convertIntegerToRomanNumber(10));
    }

    @Test
    public void testConvertIntegerToRomanNumberFor40() {
        assertEquals("XL", IntegerToRomanNumber.convertIntegerToRomanNumber(40));
    }

    @Test
    public void testConvertIntegerToRomanNumberFor50() {
        assertEquals("L", IntegerToRomanNumber.convertIntegerToRomanNumber(50));
    }

    @Test
    public void testConvertIntegerToRomanNumberFor90() {
        assertEquals("XC", IntegerToRomanNumber.convertIntegerToRomanNumber(90));
    }

    @Test
    public void testConvertIntegerToRomanNumberFor100() {
        assertEquals("C", IntegerToRomanNumber.convertIntegerToRomanNumber(100));
    }

    @Test
    public void testConvertIntegerToRomanNumberFor400() {
        assertEquals("CD", IntegerToRomanNumber.convertIntegerToRomanNumber(400));
    }

    @Test
    public void testConvertIntegerToRomanNumberFor500() {
        assertEquals("D", IntegerToRomanNumber.convertIntegerToRomanNumber(500));
    }

    @Test
    public void testConvertIntegerToRomanNumberFor900() {
        assertEquals("CM", IntegerToRomanNumber.convertIntegerToRomanNumber(900));
    }

    @Test
    public void testConvertIntegerToRomanNumberFor1000() {
        assertEquals("M", IntegerToRomanNumber.convertIntegerToRomanNumber(1000));
    }
}