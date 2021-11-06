//классы
public class FirstProgram {
    //методы (определение, объявление методов - чтобы использовать в основной main-точке, main - методе
    // МЕТОД МОЖНО ОБЪЯВИТЬ И ДО ЕГО ВЫЗОВА
    // Java анализирует весь текст программы, и ей не важнео где находится объявление метода
    /** метод будет складывать значение двух чисел и возвращать результат этой операции
     *
     * @param number1 первое число
     * @param number2 второе число
     * @return результат сложения двух чисел
     */

    public static int summa(int number1, int number2) {
        /* в этой переменной будет храниться результат сложения двух чисел.
        Результат вычисления должен быть совместим по типу с числами,
        над которыми осуществляется операция сложения.*/
        return number1 + number2;
    }
    public static int umnoj(int number1) {return 3*number1 + 122;}


    public static int minus(int number1, int number2){return number1 - number2;}

//вызов функций (методов)
    public static void main(String[] args) {
        // вывод текста
        System.out.println("Привет, миръ!");

        // операции сложения
        int calc1 = summa(1,545);
        System.out.println(calc1);
        int calc2 = summa(121,52);
        System.out.println(calc2);

        // операции вычитания
        int calc3 = minus(-44,14);
        System.out.println(calc3);

        // операции умножения
        int calc4 = umnoj(7);
        System.out.println(calc4);
    }


}
