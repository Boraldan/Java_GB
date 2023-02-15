package DZ2;

/**
 * 2) Дана последовательность из N целых чисел. Верно ли, что последовательность
 * является возрастающей.
 */

public class task2 {

   public static void main(String[] args) {
      int[] myArr = { 1, 2, 3, 6, 7, 8 };
      System.out.println(Check(myArr));
   }

   public static String Check(int[] array) {
      for (int i = 0; i < array.length - 1; i++) {
         if (array[i] >= array[i + 1]) {
            return "Не возростающий";
         }
      }
      return "Возрастающий";

   }
}
