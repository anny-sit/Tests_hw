package pro.sky.skypro_spring_calculator_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.skypro_spring_calculator_tests.CalcServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalcServiceParamTest {
    CalcServiceImpl calcService = new CalcServiceImpl();

    //plusTest
    public static Stream<Arguments> provideParamsForPlusTest() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(4, 5, 9)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForPlusTest")
    public void plusTest(Integer one, Integer two, Integer result) {
        Integer real = calcService.plus(one, two);
        assertEquals(result, real);
    }

    //minusTest
    public static Stream<Arguments> provideParamsForMinusTest() {
        return Stream.of(
                Arguments.of(1, 2, -1),
                Arguments.of(4, 5, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusTest")
    public void minusTest(Integer one, Integer two, Integer result) {
        Integer real = calcService.minus(one, two);
        assertEquals(result, real);
    }

    //multiplyTest
    public static Stream<Arguments> provideParamsForMultiplyTest() {
        return Stream.of(
                Arguments.of(1, 2, 2),
                Arguments.of(4, 5, 20)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTest")
    public void multiplyTest(Integer one, Integer two, Integer result) {
        Integer real = calcService.multiply(one, two);
        assertEquals(result, real);
    }

    //divideTest
    public static Stream<Arguments> provideParamsForDivideTest() {
        return Stream.of(
                Arguments.of(1, 2, 0.5),
                Arguments.of(40, 5, 8.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTest")
    public void divideTest(Integer one, Integer two, Double result) {
        Double real = calcService.divide(one, two);
        assertEquals(result, real);
    }
}
