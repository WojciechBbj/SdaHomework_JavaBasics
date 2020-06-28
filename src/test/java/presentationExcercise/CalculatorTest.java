package presentationExcercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @BeforeEach
    void setUp() {

    }

    @ParameterizedTest
    @CsvSource({ "1, 2, 3", "2, -3, -1", "-3, 5, 2", "-1, -3, -4" })
    void thatWeCanAddTwoNumbers(double a, double b, double expected) {
        Calculator calculator = new Calculator();
        assertEquals(expected,
                calculator.add(a, b),
                "Sum of " + a + " and " + b + " should be " + expected);
    }

    @Test
    void thatWeCanAddToNegativeNumber() {
        Calculator calculator = new Calculator();
        //given
        double a = -3.0;
        double b = -2.0;

        //when
        double sum = calculator.add(a, b);

        //then
        assertEquals(-5, sum, "Sum of a = " + a + " b = " + b + " should be equal -5");

    }

    @Test
    void thatWeCanSubtractToPositiveNumber() {
        Calculator calculator = new Calculator();
        //given
        double a = 8.0;
        double b = 3.0;

        //when
        double subtraction = calculator.subtract(a, b);

        //then
        assertEquals(5, subtraction, "Subtraction of a = " + a + " b = " + b + " should be equal 5");

    }

    @Test
    void thatWeCanSubtractToNegativeNumber() {
        Calculator calculator = new Calculator();
        //given
        double a = -6.0;
        double b = -3.0;

        //when
        double subtraction = calculator.subtract(a, b);

        //then
        assertEquals(-3, subtraction, "Subtraction of a = " + a + " b = " + b + " should be equal -3");

    }

    @Test
    void thatWeCanMultiplyToPositiveNumber() {
        Calculator calculator = new Calculator();
        //given
        double a = 5.0;
        double b = 4.0;

        //when
        double multiplication = calculator.multiply(a, b);

        //then
        assertEquals(20, multiplication, "Subtraction of a = " + a + " b = " + b + " should be equal 20");

    }

    @Test
    void thatWeCanMultiplyToNegativeNumber() {
        Calculator calculator = new Calculator();
        //given
        double a = -6.0;
        double b = -3.0;

        //when
        double multiplication = calculator.multiply(a, b);

        //then
        assertEquals(18, multiplication, "Subtraction of a = " + a + " b = " + b + " should be equal 18");

    }

    @Test
    void thatWeCanDivideToPositiveNumber() {
        Calculator calculator = new Calculator();
        //given
        double a = 16.0;
        double b = 4.0;

        //when
        double divide = calculator.divide(a, b);

        //then
        assertEquals(4, divide, "Subtraction of a = " + a + " b = " + b + " should be equal 4");

    }

    @Test
    void thatWeCanDivideToNegativeNumber() {
        Calculator calculator = new Calculator();
        //given
        double a = -32.0;
        double b = -4.0;

        //when
        double divide = calculator.divide(a, b);

        //then
        assertEquals(8, divide, "Subtraction of a = " + a + " b = " + b + " should be equal 8");

    }

}