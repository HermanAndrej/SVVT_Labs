package Lab2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void add() {
        int result = calculator.add(5, 2);
        assertEquals(7, result, "Result should be 7!");
    }

    @Test
    void testSubtract() {
        int result = calculator.subtract(5, 2);
        assertEquals(3, result, "Result should be 3!");
    }

    @Test
    void testSubstractNegative() {
        assertNotEquals(7, calculator.subtract(10, 2), "Result shouldn't be 7!");
    }

    @Test
    void testFactorial() {
        assertEquals(120, calculator.factorial(5));
        assertEquals(6, calculator.factorial(3));
    }

    @Test
    void testFactorialNegative() {
        assertNotEquals(115, calculator.factorial(5), "Result shouldn't be 115!");
    }

    @Test
    void testStringToArrayOfWordsNull() {
        assertNull(calculator.stringToArrayOfWords(null));
    }

    @Test
    void testStringToArrayOfWordsNotNull() {
        assertNotNull(calculator.stringToArrayOfWords("Hello dear world!"));
    }
    @Test
    void testStringToArrayOfWords() {
        assertArrayEquals(new String[]{"Hello", "dear", "world!"}, calculator.stringToArrayOfWords("Hello dear world!"));
    }

    @Test
    void testIfArrayIsSorted() {
        int[] arr = {3, 8, 2, 9, 12, 6};
        int[] expected = {2, 3, 6, 8, 9, 12};
        assertArrayEquals(expected, calculator.sort(arr));
    }

    @Test
    void testIfArrayIsEmpty() {
        int[] arr = {};
        int[] expected = {};
        assertArrayEquals(expected, calculator.sort(arr));
    }
}