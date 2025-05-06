import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerWithMostWaterTest {

    private ContainerWithMostWater container;
    private int[] arr1;
    private int[] arr2;

    @BeforeEach
    void setUp() {
        container = new ContainerWithMostWater();
        arr1 = new int[]{1, 1, 5};
        arr2 = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
    }

    @Test
    void maxArea() {
        assertEquals(2, container.maxArea(arr1));
        assertEquals(49, container.maxArea(arr2));
    }

    @Test
    void maxAreaOptimized() {
        assertEquals(2, container.maxAreaOptimized(arr1));
        assertEquals(49, container.maxAreaOptimized(arr2));
    }
}