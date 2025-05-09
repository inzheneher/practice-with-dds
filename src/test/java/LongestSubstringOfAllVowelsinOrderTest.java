import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringOfAllVowelsinOrderTest {

    LongestSubstringOfAllVowelsinOrder substring;

    @BeforeEach
    void setUp() {
        substring = new LongestSubstringOfAllVowelsinOrder();
    }

    @Test
    void longestBeautifulSubstring() {
        assertEquals(13, substring.longestBeautifulSubstring("aeiaaioaaaaeiiiiouuuooaauuaeiu"));
        assertEquals(5, substring.longestBeautifulSubstring("aeeeiiiioooauuuaeiou"));
        assertEquals(0, substring.longestBeautifulSubstring("a"));
    }
}