
/** 
 * Интерфейс - Вычисления
 * @version 1.0
*/
public interface iCalculable {

     /**
     * Метод - сложение
     * @param arg - значения нового аргумента
     */
    iCalculable sum(Double arg);

    /**
     * Метод - вычетание
     * @param arg - значения нового аргумента
     */
    iCalculable diff(Double arg);

    /**
     * Метод - умножение
     * @param arg - значения нового аргумента
     */
    iCalculable multi(Double arg);

    /**
     * Метод - деление
     * @param arg - значения нового аргумента
     */
    iCalculable divis(Double arg);

    /**
     * Метод - возведение в степень
     * @param arg - значения нового аргумента
     * @throws InvalidInputException
     */
    iCalculable calculatePower(Double arg) throws InvalidInputException;

    /**
     * Получение значения - резултат
     */
    Double getResult();
    
}
