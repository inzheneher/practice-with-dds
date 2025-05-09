import java.util.HashMap;
import java.util.Map;

class LongestSubstringOfAllVowelsinOrder {
    public int longestBeautifulSubstring(String word) {
        if (word == null || word.length() == 0) return 0;
        Map<Character, Boolean> found = new HashMap<>();
        char c, p = word.charAt(0);
        int max = 0, len = 1;
        for (int i = 1; i <word.length() ; i++) {
            c = word.charAt(i);
            found.put(c, true);
            if (c < p || i == word.length() - 1) {
                if (found.size() == 5) {
                    max = Math.max(max, len);
                }
                if (i == word.length() - 1) {
                    max++;
                }
                len = 1;
                found = new HashMap<>();
                found.put(c, true);
            } else {
                len++;
            }
            p = c;

        }

        return max;
    }
}
//"aeeeiiiioooauuuaeiou"
