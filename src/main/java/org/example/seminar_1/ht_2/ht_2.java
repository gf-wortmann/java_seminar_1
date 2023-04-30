/*
2) Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
        Пример ввода:
        1 2 1 2 -1 1 3 1 3 -1 0
        Логика расчета:
        2 -1 переход -> 2 в сумму
        3 -1 переход -> 3 в сумму
        Пример вывода: 5
 */
package org.example.seminar_1.ht_2;

import java.util.Scanner;

public class ht_2 {
    public static void main ( String[] args ) {
        int pre_negative_count = getPreNegativeCount ();
        System.out.printf ( "Sum of pre-negative numbers is: %d", pre_negative_count );
    }

    private static int getPreNegativeCount () {
        Scanner scanner = new Scanner ( System.in );
        int counter = 0;
        System.out.println ( "Enter the sequence of integer numbers. Zero marks finish of entering." );
        int number_1 = scanner.nextInt ( );
        while(number_1 != 0){
            int number_2 = scanner.nextInt ( );
            if (number_2 < 0){
                counter += number_1;
            }
            number_1 = number_2;
        }
        scanner.close ();
        return counter;
    }
}
