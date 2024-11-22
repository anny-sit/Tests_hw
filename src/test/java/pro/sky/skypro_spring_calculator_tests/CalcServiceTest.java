package pro.sky.skypro_spring_calculator_tests;

import org.junit.jupiter.api.Test;
import pro.sky.skypro_spring_calculator_tests.CalcServiceImpl;
import pro.sky.skypro_spring_calculator_tests.exceptions.MyDividerException;

import static org.junit.jupiter.api.Assertions.*;

public class CalcServiceTest {
    CalcServiceImpl calcService = new CalcServiceImpl();
    Integer one = 1;
    Integer two = 1;
    Integer three = 2;
    Integer four = 4;

    @Test
    public void plusTest() {
        Integer expected = one + two;
        Integer real = calcService.plus(one, two);
        assertEquals(expected, real);

        expected = three + four;
        real = calcService.plus(three, four);
        assertEquals(expected, real);

    }
    @Test
    public void minusTest() {
        Integer expected = one - two;
        Integer real = calcService.minus(one, two);
        assertEquals(expected, real);

        expected = three - four;
        real = calcService.minus(three, four);
        assertEquals(expected, real);

    }
    @Test
    public void multiplyTest() {
        Integer expected = one * two;
        Integer real = calcService.multiply(one, two);
        assertEquals(expected, real);

        expected = three * four;
        real = calcService.multiply(three, four);
        assertEquals(expected, real);

    }
    @Test
    public void divideTest() {
        Double expected = one * 1.0 / two;
        Double real = calcService.divide(one, two);
        assertEquals(expected, real);

        expected = three * 1.0 / four;
        real = calcService.divide(three, four);
        assertEquals(expected, real);

    }

    @Test
    public void divideExceptionTest() {
        assertThrows(MyDividerException.class, () -> calcService.divide(one, 0));
        assertThrows(MyDividerException.class, () -> calcService.divide(three, 0));

    }
}
