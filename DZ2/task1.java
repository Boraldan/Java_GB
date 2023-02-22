package DZ2;

import java.net.PasswordAuthentication;

/**
 * 1) Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
public class task1 {
   public static void main(String[] args) {

      int sum = 0;
      int[] myArr = { 1, 2, 3, 6, 7, 8, 9 };
      for (int i = 0; i < myArr.length; i++) {
         if (myArr[i] == 2 || myArr[i] == 3) {
            sum += myArr[i];
         } else if (myArr[i] > 3) {
            if (Check(myArr[i]) == 0) {
               sum += myArr[i];
            }
         }
      }
      System.out.printf("Sum = %s", sum);
   }

   public static int Check(int num) {

      if (num % 2 == 0)
         return 1;
      for (int i = 3; i < num; i += 2) {
         if (num % i == 0)
            return 1;
      }
      return 0;
   }
}
