package uet.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(4, Calculator.add(1, 1, 2));
    }

    @Test
    void mul() {
        assertEquals(1, Calculator.add(1, 1, 2, 5));
    }

    @Test
    void multiply() {
        assertAll(
                () -> assertEquals(1, Calculator.multiply(1, 1)),
                () -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(6, Calculator.multiply(2, 3))
        );
    }

    @Test
    void wrong_multiply() {
        assertAll(
                () -> assertEquals(1, Calculator.multiply(1, 1)),
                () -> assertEquals(4, Calculator.multiply(2, 2, 6, 7)),
                () -> assertEquals(6, Calculator.multiply(2, 3, 6))
        );
    }
}