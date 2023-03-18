package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
        @RequestMapping("/calculator")
public class СalculatorСontroller {
    private final СalculatorService service;

    public СalculatorСontroller(СalculatorService service) {
        this.service = service;
    }

    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @RequestMapping("/plus")
    public String plus(@RequestParam(required = false) String num1,@RequestParam(required = false) String num2) {
        if (num1 == null || num2 == null || num1.isEmpty() || num2.isEmpty()) {
            return "Введите два параметра";
        }
        return num1 + " + " + num2 + "="  +service.plus(Integer.parseInt(num1), Integer.parseInt(num2));

    }
    @RequestMapping("/minus")
    public String minus(@RequestParam(required = false) String num1,@RequestParam(required = false) String num2) {
        if (num1 == null || num2 == null || num1.isEmpty() || num2.isEmpty()) {
            return "Введите два параметра";
        }
        return num1 + " - " + num2 + "=" +service.minus(Integer.parseInt(num1),Integer.parseInt(num2));
    }
    @RequestMapping("/multiply")
    public String multiply(@RequestParam(required = false) String num1,@RequestParam(required = false) String num2) {
                if (num1 == null || num2 == null || num1.isEmpty() || num2.isEmpty()) {
                    return "Введите два параметра";
            }
        return num1 + " * " + num2 + "=" +service.multiply(Integer.parseInt(num1),Integer.parseInt(num2));
    }
    @RequestMapping("/divide")
    public String divide(@RequestParam(required = false) String num1,@RequestParam(required = false) String num2) {
        if (num1 == null || num2 == null || num1.isEmpty() || num2.isEmpty()) {
            return "Введите два параметра";
        }
        if (num2.equals("0")){
            return "Делить на 0 нельзя" ;
        }
            return num1 + " / " + num2 + "=" + service.divide(Integer.parseInt(num1), Integer.parseInt(num2));
    }
}