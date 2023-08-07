import java.util.Scanner;

/** 
 * Класс - числа
 * @author Деров Константин
 * @version 1.0
*/
public class Number {

    /**
     * Метод - производит запрос у пользователя, проверяет является ли вводимоя строка числом и возвращяет число
     * @param txt1 - пример текста("Введите первое число...")
     * @param txt2 - пример текста("Введены неверные данные, введите число...")
     */
    public int Input(String txt1, String txt2) {

        System.out.print(txt1);
        Scanner input = new Scanner(System.in);
        String txt = input.nextLine();
        while (!txt.matches("[-+]?\\d*\\.?\\d+")){
            System.out.print(txt2);
            txt = input.nextLine();
        }
        int num = Integer.parseInt (txt);
        return num;

    }
    
}
