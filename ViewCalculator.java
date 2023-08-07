
import java.util.Scanner;

/** 
 * Класс - Вид калькулятора
 * @author --
 * @version 1.0
*/
public class ViewCalculator {
    /** Поле - Интерфейс - Вычисления */
    private iCalculable calculator;

    /**
     * Конструктор - создание нового объекта (Вид калькулятора)
     * @param calculator - Интерфейс - Вычисления
     */
    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    /**
     * Метод - запускает цикл ввода команд калькулятра
     */
    public void run() {

        String txt1 = "Введите первый аргумент...";
        String txt2 = "Введены неверные данные, введите число...";
        String txt3 = "Введите второй аргумент...";
        String txt4 = "Введите команду (+, -, *, /, **, =) : ";
        String txt5 = "Результат %.1f\n";
        String txt6 = "Еще посчитать (Y/N)?";
        String txt7 = "Ошибка при вычислении...";

        while (true) {
            Double primaryArg = new Number().Input(txt1, txt2);
            calculator.sum(primaryArg);
            while (true) {
                String cmd = prompt(txt4);
                if (cmd.equals("+")) {
                    try {
                        Double arg = new Number().Input(txt3, txt2);
                        calculator.sum(arg);
                    }
                    catch (Exception e){
                        System.out.println(txt7 + e.getMessage());
                    }
                    continue;
                }
                if (cmd.equals("-")) {
                    try {
                        Double arg = new Number().Input(txt3, txt2);
                        calculator.diff(arg);
                    }
                    catch (Exception e){
                        System.out.println(txt7 + e.getMessage());
                    }
                    continue;
                }
                if (cmd.equals("*")) {
                    try {
                        Double arg = new Number().Input(txt3, txt2);
                        calculator.multi(arg);
                    }
                    catch (Exception e){
                        System.out.println(txt7 + e.getMessage());
                    }
                    continue;
                }
                if (cmd.equals("/")) {
                    try {
                        Double arg = new Number().Input(txt3, txt2);
                        calculator.divis(arg);
                    }
                    catch (Exception e){
                        System.out.println(txt7 + e.getMessage());
                    }
                    continue;
                }
                if (cmd.equals("**")) {
                    try {
                        Double arg = new Number().Input(txt3, txt2);
                        calculator.calculatePower(arg);
                    }
                    catch (Exception e){
                        System.out.println(txt7 + e.getMessage());
                    }
                    continue;
                }
                if (cmd.equals("=")) {
                    Double result = calculator.getResult();
                    System.out.printf(txt5, result);
                    break;
                }
            }
            String cmd = prompt(txt6);
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    
}
