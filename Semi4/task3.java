package Semi4;

import java.util.*;
/** 2.	Построить однонаправленный список целых чисел. Найти сумму четных элементов списка. */
public class task3 {
   public static void main(String[] args) {
      LinkedList <Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
      int sum = 0;
      for (int i = 0; i < list.size(); i++) {
          if (list.get(i) % 2 == 0) sum += list.get(i);
      }
      System.out.println("Сумма четных элементов = " + sum);
  }
}
