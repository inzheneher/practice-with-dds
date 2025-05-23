import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMinimumInRotatedSortedArrayTest {

    FindMinimumInRotatedSortedArray findMinimum;

    @BeforeEach
    void setUp() {
        findMinimum = new FindMinimumInRotatedSortedArray();
    }

    @Test
    void findMin() {
        assertEquals(1, findMinimum.findMin(new int[]{3, 4, 5, 1, 2}));
        assertEquals(0, findMinimum.findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
        assertEquals(1, findMinimum.findMin(new int[]{7, 1, 2, 3, 4, 5, 6}));
    }
}