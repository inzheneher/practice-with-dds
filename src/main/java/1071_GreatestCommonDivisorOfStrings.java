class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        String mr;
        if (str1.length() > str2.length()) {
            mr = maxRepSubstr(str2);
        } else {
            mr = maxRepSubstr(str1);
        }

        return mr;
    }

    private String maxRepSubstr(String str) {
        int s = 0, e = str.length() - 1;
        StringBuilder s1 = new StringBuilder(), s2 = new StringBuilder();
        boolean found = false;
        while (s < e) {
            s1.append(str.charAt(s));
            s2.append(str.charAt(e));
            if (s1.compareTo(s2) == 0) {
                found = true;
            } else {
                if (found) {
                    return s1.toString();
                }
            }
            s++;
            e--;
        }
        return s1.toString();
    }
}
