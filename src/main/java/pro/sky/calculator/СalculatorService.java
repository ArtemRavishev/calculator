package pro.sky.calculator;

import org.springframework.stereotype.Service;

public interface СalculatorService {

        public int plus (int num1, int num2);

        public int minus(int num1, int num2);

        public int multiply (int num1, int num2);

        public int divide(int num1, int num2);
}
