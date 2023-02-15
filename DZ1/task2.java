// 2) Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
// Пример: 1 2 1 2 -1 1 3 1 3 -1 0
// 2 -1 переход - 2 в сумму
// 3 -1 переход 3 в сумму
// суммарно выведет 5

package DZ1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();

        int sum = 0;

        while (n1 != 0) {
            int n2 = scan.nextInt();
            if (n1 > 0 && n2 < 0) {
                sum += n1;
            }
            n1 = n2;
        }

        System.out.printf("Сумма = %s", sum);

    }
}
