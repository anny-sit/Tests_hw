package pro.sky.skypro_spring_calculator_tests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skypro_spring_calculator_tests.exceptions.MyDividerException;
import pro.sky.skypro_spring_calculator_tests.exceptions.MyNullException;

@RestController
@RequestMapping("/calculator")
public class CalcController {

    private final CalcServiceImpl calcService;

    public CalcController(CalcServiceImpl calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus") // /plus?num1=1&num2=4
    public String plus(@RequestParam(value = "num1", required = false) Integer n1,
                       @RequestParam(value = "num2", required = false) Integer n2) {

        try {
            return n1 + " + " + n2 + " = " + calcService.plus(n1, n2);
        } catch (MyNullException e) {
            return e.getMessage();
        }

    }

    @GetMapping("/minus") // /minus?num1=1&num2=4
    public String minus(@RequestParam(value = "num1", required = false) Integer n1,
                        @RequestParam(value = "num2", required = false) Integer n2) {
        try {
            return n1 + " - " + n2 + " = " + calcService.minus(n1, n2);
        } catch (MyNullException e) {
            return e.getMessage();
        }

    }

    @GetMapping("/multiply") // /multiply?num1=1&num2=4
    public String multiply(@RequestParam(value = "num1", required = false) Integer n1,
                           @RequestParam(value = "num2", required = false) Integer n2) {

        try {
            return n1 + " * " + n2 + " = " + calcService.multiply(n1, n2);
        } catch (MyNullException e) {
            return e.getMessage();
        }

    }

    @GetMapping("/divide") // /divide?num1=1&num2=0
    public String divide(@RequestParam(value = "num1", required = false) Integer n1,
                         @RequestParam(value = "num2", required = false) Integer n2) {

        try {
            return n1 + " / " + n2 + " = " + calcService.divide(n1, n2);
        } catch (MyDividerException | MyNullException e) {
            return e.getMessage();
        }

    }

}
