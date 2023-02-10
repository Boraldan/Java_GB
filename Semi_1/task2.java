package Semi_1;

/**
Дана последовательность N целых чисел. Найти количество положительных 
чисел, после которых следует отрицательное число.
 */

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Введите число num1: ");
        int num1 = scan.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            System.out.println("Введите число num2: ");

            int num2 = scan.nextInt();
            if (num1 > 0 && num2 < 0) {
                count ++;

            }
            num1 = num2;
        }
        System.out.println(count);

    }
}