import java.util.Arrays;
import java.util.Scanner;

import Task_1.CheckNumber;
import Task_1.InvalidNumberException;
import Task_2.TwoNumbers;

public class Main {

    public static void main(String[] args) throws Exception {

        // Запускаем алгоритм Task_1
        String txt1 = "Введите число...";
        String txt2 = "Введены неверные данные, введите число...";
        int num = new Number().Input(txt1, txt2);
        CheckNumber checkNumber = new CheckNumber();
        checkNumber.OnPositive(num);

        // Запускаем алгоритм Task_2
        txt1 = "Введите первое число...";
        txt2 = "Введены неверные данные, введите первое число...";
        int num1 = new Number().Input(txt1, txt2);
        txt1 = "Введите второе число...";
        txt2 = "Введены неверные данные, введите второе число...";
        int num2 = new Number().Input(txt1, txt2);
        TwoNumbers res = new TwoNumbers(num1, num2);
        res.Division();

    }

}