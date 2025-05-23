import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTwoIntegersTest {

    DivideTwoIntegers divideTwoIntegers;

    @BeforeEach
    void setUp() {
        divideTwoIntegers = new DivideTwoIntegers();
    }

    @Test
    void divide() {
        assertEquals(3, divideTwoIntegers.divide(10, 3));
        assertEquals(-2, divideTwoIntegers.divide(7, -3));
    }
}