package lesson2;

//классы
public class FirstProgram {
    //методы (определение, объявление методов - чтобы использовать в основной main-точке, main - методе
    // МЕТОД МОЖНО ОБЪЯВИТЬ И ДО ЕГО ВЫЗОВА
    // Java анализирует весь текст программы, и ей не важнео где находится объявление метода

    /** метод будет складывать значения двух чисел и возвращать результат этой операции
     *
     * @param number1 первое число 1
     * @param number2 второе число 2
     * @return результат сложения двух чисел
     */

    public static int summa(int number1, int number2) {
        /* в этой переменной будет храниться результат сложения двух чисел.
        Результат вычисления должен быть совместим по типу с числами,
        над которыми осуществляется операция сложения.*/
        return number1 + number2;
    }

    /** метод будет умножать число на коэффициент и прибавлять число
     *
     * @param number1  число
     * @return результат умножения
     */

    public static int umnoj(int number1) {return 3*number1 + 122;}

    /** метод будет вычитать значения двух чисел и возвращать результат этой операции
     *
     * @param number1  число 1
     * @param number2  число 2
     * @return результат вычитания двух чисел
     */

    public static int minus(int number1, int number2){return number1 - number2;}

    /** метод будет осуществлять расчёт мощности электрического тока по формуле P=I*U*cos(fi), где
     * P - мощность, кВт, I - ток,А, U  - напряжение, В, cos(fi) - коэффициент мощности (число)
     * @param I - сила тока, А
     * @param U - напряжение, В
     * @return результат вычисления электрической мощности
     */

    public static double power(int I, int U, double cosFI){
    return (I*U*cosFI)/1000;
    }

    //вызов функций (методов)
    public static void main(String[] args) {

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

        // рачсёт мощности
        double calc5 = power(10,220, 0.8);
        System.out.print(calc5);
        System.out.println(" кВт");

    }


}
