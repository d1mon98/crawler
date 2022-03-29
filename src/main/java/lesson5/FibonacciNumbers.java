package lesson5;

import java.util.Scanner;

public class FibonacciNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер члена ряда Фиббоначи, " +
                "который вы хотите вычислить");
        int FibRow = in.nextInt();


        if (FibRow == 1) {
            System.out.println("Число Фиббоначи №: " + (FibRow) + " :" + "0");
        } else if (FibRow == 2 ||FibRow == 3) {
            System.out.println("Число Фиббоначи №: " + (FibRow) + " :" + "1");
        } else {
            System.out.println("Число Фиббоначи №" + (FibRow) + " :" + ((FibRow - 1) + (FibRow - 2)));
        }


    }
}



