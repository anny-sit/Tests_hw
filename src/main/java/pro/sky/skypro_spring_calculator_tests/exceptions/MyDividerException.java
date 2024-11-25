package pro.sky.skypro_spring_calculator_tests.exceptions;

public class MyDividerException extends IllegalArgumentException {
    public MyDividerException(String s) {
        super(s);
    }
}
