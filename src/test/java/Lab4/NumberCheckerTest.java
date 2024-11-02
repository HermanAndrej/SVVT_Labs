package Lab4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTest {
    NumberChecker numberChecker = new NumberChecker();

    @ParameterizedTest
    @ValueSource(ints = {2, 5, 17, 19, 211})
    public void testIsPrime(int n) {
        assertTrue(numberChecker.isPrime(n));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/fibonacci.csv", numLinesToSkip = 1)
    public void testFibonacci(int n, int expected) {
        assertEquals(expected, numberChecker.fibonacci(n));
    }

}