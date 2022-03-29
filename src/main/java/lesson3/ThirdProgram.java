package lesson3;

public class ThirdProgram {
    public static void main(String[] args) {
        long summa = sum(3, 5);
        System.out.println("сумма чисел 3 и 5 = " + summa);
        long del = mod (31,3);
        System.out.println("остаток от деления чисел 31 и 3 = " + del);
        long result = pow(31,3);
        System.out.println("возведение часла 31 в степень 3 = " + result);
    }

    private static long sum(int i, int i1) {
        return i + i1;
    }
    public static long mod(int i, int i1){
        return i % i1;

    }
    // возведение в степень
    public static long pow(int i, int i1){
        return (long) Math.pow(i, i1);

    }
}