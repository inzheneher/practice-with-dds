import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FourDivisorsTest {

    FourDivisors fourDivisors;

    @BeforeEach
    void setUp() {
        fourDivisors = new FourDivisors();
    }

    @Test
    void sumFourDivisors() {
        assertEquals(32, fourDivisors.sumFourDivisors(new int[]{21, 4, 7}));
        assertEquals(64, fourDivisors.sumFourDivisors(new int[]{21, 21}));
        assertEquals(0, fourDivisors.sumFourDivisors(new int[]{1, 2, 3, 4, 5}));
    }
}