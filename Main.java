

public class Main {

    public static void main(String[] args) {

        iCalculable calculator = new PowerCalculator(0.0);
        ViewCalculator viewCalculator = new ViewCalculator(calculator);
        viewCalculator.run();

        // double a = 2;
        // double b = -2;
        // double res = a;
        // while (++b < 0){
        //     System.out.println(b);
        //     a *= res;
        // }
        // a = 1 / a;
        // System.out.println(a)  ;



        // // Запускаем алгоритм Task_1
        // String txt1 = "Введите число...";
        // String txt2 = "Введены неверные данные, введите число...";
        // int num = new Number().Input(txt1, txt2);
        // CheckNumber checkNumber = new CheckNumber();
        // checkNumber.OnPositive(num);

        // // Запускаем алгоритм Task_2
        // txt1 = "Введите первое число...";
        // txt2 = "Введены неверные данные, введите первое число...";
        // int num1 = new Number().Input(txt1, txt2);
        // txt1 = "Введите второе число...";
        // txt2 = "Введены неверные данные, введите второе число...";
        // int num2 = new Number().Input(txt1, txt2);
        // TwoNumbers res = new TwoNumbers(num1, num2);
        // res.Division();

    }

}