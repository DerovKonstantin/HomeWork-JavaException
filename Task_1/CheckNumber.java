package Task_1;

import java.util.Scanner;

/** 
 * Класс - проверка числа
 * @author Деров Константин
 * @version 1.0
*/
public class CheckNumber {

    /**
     * Метод -  проверяет является ли число положительным
     */
    public void OnPositive(int num) {
        
        // System.out.print("Введите число...");
        // Scanner input = new Scanner(System.in);
        // String txt = input.nextLine();
        // while (!txt.matches("[-+]?\\d*\\.?\\d+")){
        //     System.out.print("Введены неверные данные, введите число...");
        //     txt = input.nextLine();
        // }
        // int num = Integer.parseInt (txt);
        try{
            if(num <= 0) throw new InvalidNumberException("Некорректное число");
            System.out.println("Число корректно");
        }
        catch (InvalidNumberException e){
            System.out.println(e.getMessage());

        }

    }  

}
