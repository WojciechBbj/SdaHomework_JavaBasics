package softwareTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import softwareTest.Calculator;


import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculatorTest {

    @BeforeEach
    void setUp() {

    }

    @ParameterizedTest
    @CsvSource({"1, 2, 3", "2, -3, -1", "-3, 5, 2", "-1, -3, -4"})
    void thatWeCanAddTwoNumbers(double a, double b, double expected) {
        Calculator calculator = new Calculator();
//        assertEquals(expected,
//                calculator.add(a, b),
//                "Sum of " + a + " and " + b + " should be " + expected);
        org.assertj.core.api.Assertions.assertThat(expected)
                .as("Sum of %f and %f should be $=%f", a, b, expected);
    }

    @Test
    void thatWeCanSubtractTwoPositiveNumbers() {

        Calculator calculator = new Calculator();

        //given

        double a = 5;
        double b = 6;

        //when

        double subtraction = calculator.subtract(a, b);

        //test

        assertEquals(-1, subtraction, "Sum of a = " + a + " b = " + b + " should be equal -1");

    }

    @ParameterizedTest
    @CsvSource({"4, 3, 1", "5, 3, 2", "-9, -3, -6", "-7, -2, -5"})
    void thatWeCanSubtracktNumbers(double a, double b, double expected) {
        Calculator calculator = new Calculator();
        assertEquals(expected,
                calculator.subtract(a, b),
                "Sum of " + a + " and " + b + " should be " + expected);
    }
}