package Semi_1;

import java.util.Scanner;

/**
 * Задан массив nums. Мы определяем текущую сумму массива как runningSum[i] =
 * sum(nums[0]...nums[i]).
 * 
 * Возвращает текущую сумму чисел.
 */

public class task6 {
    public static void main(String[] args) {
        System.out.println(runningSum());
    }

    public static String runningSum() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] resArray = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            resArray[i] = sum;
        }
        resArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            resArray[i] = arr[i] + resArray[i - 1];
        }
        String res = "Результат:";
        for (int i = 0; i < resArray.length; i++) {
            res += " " + resArray[i];
        }
        return res;
    }
}
