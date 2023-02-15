package DZ2;

/**
 * 3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов
 * двузначных элементов массива.
 */
public class task3 {

   public static void main(String[] args) {
      int[] myArr = { 10, 2, -30, 300, 6, -2, 70, 8, -3, 15 };
      int[] oldArr = new int[myArr.length];

      int sum = 0;
      for (int i = 0; i < myArr.length; i++) {
         oldArr[i] = myArr[i];
         if (myArr[i] < 0) {
            myArr[i] *= -1;
         }
         if (String.valueOf(myArr[i]).length() == 2) {
            sum += i;
         }
      }

      for (int i = 0; i < oldArr.length; i++) {
         if (oldArr[i] < 0) {
            oldArr[i] = sum;
         }
      }

      for (int i = 0; i < oldArr.length; i++) {
         System.out.print(oldArr[i] + ", ");
      }

   }
}