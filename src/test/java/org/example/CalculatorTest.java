package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class CalculatorTest {
    @Test
    public void testAdd() {

        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    public void EdgeCaseTestAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(0, 0);
        assertEquals(0, result, "0 + 0 should equal 0");
    }

    @Test
    public void testAddMaxValues() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> {
            calculator.add(Integer.MAX_VALUE, Integer.MAX_VALUE);
        });
    }
}
