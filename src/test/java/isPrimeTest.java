import org.junit.Test;

import static org.junit.Assert.*;

public class isPrimeTest {

    @Test
    public void checkingIfNumberIsPrime() {
        isPrime isPrime= new isPrime();
        assertTrue("true",isPrime.isPrime(2));

    }

    @Test
    public void checkingIfNumberIsNotPrime() {
        isPrime isPrime= new isPrime();
        assertFalse("false",isPrime.isPrime(9));

    }
}
