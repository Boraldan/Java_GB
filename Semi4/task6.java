package Semi4;

import java.util.*;
/**
 * 4.	Построить однонаправленный список целых чисел.  
 * Удалить отрицательные элементы списка.
 */
public class task6 {
   public static void main(String[] args) {
      LinkedList<Integer> ourList = new LinkedList<>(Arrays.asList(-1, -2, -3, 4, 5, -6, -7, 8, -9));

//        for (int i = ourList.size()-1; i >= 0 ; i--) {  //* удаляем с конца
//            if(ourList.get(i) < 0) ourList.remove(i);
//
//        }

      for (int i = 0; i < ourList.size(); i++) {
          if (ourList.get(i) < 0) {
              ourList.remove(i);
              i--;
          }
          System.out.println(ourList);
      }
      System.out.println(ourList);
  }
}
