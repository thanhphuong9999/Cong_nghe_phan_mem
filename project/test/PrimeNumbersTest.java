import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeNumbersTest {
    
    public PrimeNumbersTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isPrime method, of class PrimeNumbers.
     */
    @Test
    public void testIsPrime1() {
        System.out.println("isPrime");
        int n = 5;
        boolean expResult = false;
        boolean result = PrimeNumbers.isPrime(n);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsPrime2() {
        System.out.println("isPrime");
        int n = 1;
        boolean expResult = false;
        boolean result = PrimeNumbers.isPrime(n);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsPrime3() {
        System.out.println("isPrime");
        int n = 6;
        boolean expResult = false;
        boolean result = PrimeNumbers.isPrime(n);
        assertEquals(expResult, result);
    }
}
