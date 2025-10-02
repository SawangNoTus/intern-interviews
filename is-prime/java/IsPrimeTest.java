import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsPrimeTest {

    @Test
    void testNumbersLessThan2() {
        assertFalse(IsPrime.isPrime(1), "1 should not be prime");
        assertFalse(IsPrime.isPrime(0), "0 should not be prime");
        assertFalse(IsPrime.isPrime(-5), "Negative numbers should not be prime");
    }

    @Test
    void testNumber2() {
        assertTrue(IsPrime.isPrime(2), "2 should be prime");
    }

    @Test
    void testSmallPrimeNumbers() {
        assertTrue(IsPrime.isPrime(3), "3 should be prime");
        assertTrue(IsPrime.isPrime(5), "5 should be prime");
        assertTrue(IsPrime.isPrime(7), "7 should be prime");
        assertTrue(IsPrime.isPrime(11), "11 should be prime");
    }

    @Test
    void testSmallNonPrimeNumbers() {
        assertFalse(IsPrime.isPrime(4), "4 should not be prime");
        assertFalse(IsPrime.isPrime(6), "6 should not be prime");
        assertFalse(IsPrime.isPrime(8), "8 should not be prime");
        assertFalse(IsPrime.isPrime(9), "9 should not be prime");
    }

    @Test
    void testLargerPrimeNumbers() {
        assertTrue(IsPrime.isPrime(13), "13 should be prime");
        assertTrue(IsPrime.isPrime(17), "17 should be prime");
        assertTrue(IsPrime.isPrime(97), "97 should be prime");
    }

    @Test
    void testLargerNonPrimeNumbers() {
        assertFalse(IsPrime.isPrime(100), "100 should not be prime");
        assertFalse(IsPrime.isPrime(121), "121 should not be prime");
    }
}
