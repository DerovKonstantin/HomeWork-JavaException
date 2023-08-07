package Task_2;

//import java.util.Scanner;

/** 
 * Класс - Два числа
 * @author Деров Константин
 * @version 1.0
*/
public class TwoNumbers {
    /** поле первое число */
    int num1; 
    /** поле второе число */
    int num2;

    /**
     * Конструктор - создание нового объекта (Два числа)
     */
    public TwoNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * Метод - производит деление заданных чисел, в случае успеха вводит результат
     */
    public void Division() {

        try{
            if(num2 == 0) throw new DivisionByZeroException("Деление на ноль недопустимо");
            double res = (double)num1 / num2 ;
            System.out.println(res);
        }
        catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }

    }
    
}
