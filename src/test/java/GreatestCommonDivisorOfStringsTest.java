import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorOfStringsTest {

    GreatestCommonDivisorOfStrings divisor;

    @BeforeEach
    void setUp() {
        divisor = new GreatestCommonDivisorOfStrings();
    }

    @Test
    void gcdOfStrings() {
        assertEquals("ABC", divisor.gcdOfStrings("ABCABC", "ABC"));
        assertEquals("AB", divisor.gcdOfStrings("ABABAB", "ABAB"));
        assertEquals("AB", divisor.gcdOfStrings("AB", "AB"));
        assertEquals("A", divisor.gcdOfStrings("AAAA", "AAAAA"));
        assertEquals("AAAA", divisor.gcdOfStrings("AAAA", "AAAAAAAA"));
        assertEquals("", divisor.gcdOfStrings("ABC", "AB"));
        assertEquals("", divisor.gcdOfStrings("LEET", "CODE"));

    }
}