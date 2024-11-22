package pro.sky.skypro_spring_calculator_tests;

import org.springframework.stereotype.Service;
import pro.sky.skypro_spring_calculator_tests.CalcService;
import pro.sky.skypro_spring_calculator_tests.exceptions.MyDividerException;
import pro.sky.skypro_spring_calculator_tests.exceptions.MyNullException;

@Service
public class CalcServiceImpl implements CalcService {
    public int plus(Integer n1, Integer n2) {
        if (checkNull(n1) || checkNull(n2)) {
            throw new MyNullException("Указаны не все параметры");
        }
        return n1 + n2;
    }

    public int minus(Integer n1, Integer n2) {
        if (checkNull(n1) || checkNull(n2)) {
            throw new MyNullException("Указаны не все параметры");
        }
        return n1 - n2;
    }

    public int multiply(Integer n1, Integer n2) {
        if (checkNull(n1) || checkNull(n2)) {
            throw new MyNullException("Указаны не все параметры");
        }
        return n1 * n2;
    }


    public double divide(Integer n1, Integer n2) {
        if (checkNull(n1) || checkNull(n2)) {
            throw new MyNullException("Указаны не все параметры");
        }

        if (n2 == 0) {
            throw new MyDividerException("Делить на ноль нельзя!");
        }
        return (n1 * 1.0) / n2;
    }

    public boolean checkNull(Integer num) {
        if (num == null) {
            return true;
        }
        return false;
    }

}
