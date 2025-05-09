import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AsteroidCollisionTest {

    AsteroidCollision collision;

    @BeforeEach
    void setUp() {
        collision = new AsteroidCollision();
    }

    @Test
    void asteroidCollision() {
        assertArrayEquals(new int[]{5, 10}, collision.asteroidCollision(new int[]{5, 10, -5}));
        assertArrayEquals(new int[]{}, collision.asteroidCollision(new int[]{8, -8}));
        assertArrayEquals(new int[]{10}, collision.asteroidCollision(new int[]{10, 2, -5}));
        assertArrayEquals(new int[]{-2, -1, 1, 2}, collision.asteroidCollision(new int[]{-2, -1, 1, 2}));
        assertArrayEquals(new int[]{-2, -2, -2}, collision.asteroidCollision(new int[]{-2, -2, 1, -2}));
        assertArrayEquals(new int[]{-2}, collision.asteroidCollision(new int[]{-2, 2, 1, -2}));
        assertArrayEquals(new int[]{-2, -2}, collision.asteroidCollision(new int[]{-2, 1, 1, -2}));
    }
}