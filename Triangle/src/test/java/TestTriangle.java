import org.junit.jupiter.api.Test;
import triangle.Triangle;

import static org.junit.jupiter.api.Assertions.*;


public class TestTriangle {

    @Test
    void testImpossible1() {
        Triangle triangle = new Triangle(-1, 3, 3);

        assertTrue(triangle.isImpossible());
    }

    @Test
    void testImpossible2() {
        Triangle triangle = new Triangle(0, 3, 3);

        assertTrue(triangle.isImpossible());
    }

    @Test
    void testImpossible3() {
        Triangle triangle = new Triangle(1, 3, 3);

        assertFalse(triangle.isImpossible());
    }

    @Test
    void testImpossible4() {
        Triangle triangle = new Triangle(100, 3, 3);

        assertTrue(triangle.isImpossible());
    }

    @Test
    void testIsEquilateral() {
        Triangle triangle = new Triangle(2, 2, 2);

        assertAll("Equilateral triangle",
                () -> assertEquals("equilateral", triangle.classify()),
                () -> assertTrue(triangle.isEquilateral())
                );
    }

    @Test
    void testIsNotEquilateral() {
        Triangle triangle = new Triangle(2, 1, 2);

        assertFalse(triangle.isEquilateral());
    }

    @Test
    void testIsRightAngle() {
        Triangle triangle = new Triangle(3, 4, 5);

        assertAll("Right-angle triangle",
                () -> assertEquals("right-angled", triangle.classify()),
                () -> assertTrue(triangle.isRightAngled())
                );
    }

    @Test
    void testIsNotRightAngle() {
        Triangle triangle = new Triangle(4, 5, 6);

        assertFalse(triangle.isRightAngled());
    }

    @Test
    void testIsScalene() {
        Triangle triangle = new Triangle(5, 6, 7);

        assertAll("Scalene Triangle",
                () -> assertEquals("scalene", triangle.classify()),
                () -> assertTrue(triangle.isScalene()),
                () -> assertFalse(triangle.isRightAngled())
                );
    }

    @Test
    void testIsNotScalene() {
        Triangle triangle = new Triangle(5, 5, 7);

        assertFalse(triangle.isScalene());
    }

    @Test
    void testIsIsosceles() {
        Triangle triangle = new Triangle(5, 5, 8);

        assertAll("Isosceles triangle",
                () -> assertEquals("isossceles", triangle.classify()),
                () -> assertTrue(triangle.isIsosceles())
                );
    }

    @Test
    void testIsNotIsosceles() {
        Triangle triangle = new Triangle(2, 2, 2);

        assertFalse(triangle.isIsosceles());
    }
}
