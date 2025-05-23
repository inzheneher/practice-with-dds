import java.util.*;

class FourDivisors {

    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> divMap = new HashMap<>();
        for (int i : nums) {
            Integer divCount = divMap.get(i);
            if (divCount != null && divCount != -1) {
                sum += divCount;
            } else {
                var divs = getDivisors(i);

                if (divs.size() == 4) {
                    for (int j = 0; j < 4; j++) {
                        sum += divs.get(j);
                    }
                    divMap.put(i, sum);
                }
            }
        }
        return sum;
    }

    private List<Integer> getDivisors(int i) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        res.add(i);
        res.add(1);
        s.add(1);
        s.add(i);
        for (int d = 2; d < i/2 +1; d++) {
            if (s.contains(d)) continue;
            if (i % d == 0) {
                res.add(d);
            }
        }
        return res;
    }
}
