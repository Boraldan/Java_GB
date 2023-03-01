package DZ3.task2;

import java.util.*;

/**
 * Сведения о товаре состоят из наименования, страны-производителя, веса, цены,
 * сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */

public class Main {
   public static void main(String[] args) {

      Items item = new Items("air_rus", "rus", 7, 100, 1);
      Items item2 = new Items("air_eng", "eng", 15, 210, 2);
      Items item3 = new Items("air_kgz", "kgz", 20, 120, 3);
      Items item4 = new Items("air_eng", "eng", 12, 130, 1);
      Items item5 = new Items("air_rus", "rus", 9, 140, 2);
      Items item6 = new Items("air_jap", "jap", 10, 150, 3);
      Items item7 = new Items("air_ch", "chine", 11, 155, 1);
      Items item8 = new Items("air_rus", "rus", 9, 120, 1);

      List<Items> arrIt = new ArrayList<>();
      arrIt.add(item);
      arrIt.add(item2);
      arrIt.add(item3);
      arrIt.add(item4);
      arrIt.add(item5);
      arrIt.add(item6);
      arrIt.add(item7);
      arrIt.add(item8);

      Set <String> tempL = new HashSet<>();
      for (Items el : arrIt) {
         tempL.add(el.getName());
      }
      for (String el : tempL) {
         System.out.printf("Товар:  " + el + "\n");
      }

      System.out.println("Веберите сорт товара от 1 до 3: ");
      Scanner scan = new Scanner(System.in);
      int find = scan.nextInt();
      Integer costTemp = null;
      Items good = null;
      boolean flag = false;

      for (Items el : arrIt) {
         if (flag == false && el.getQual() == find) {
            costTemp = el.getCost();
            good = el;
            flag = true;
         } else if (el.getQual() == find && el.getCost() < costTemp) {
            good = el;
         }
      }

      System.out.printf("На товар %s [ %d ] сортa минимальная цена: %d y.e.", good.getName().toUpperCase(),
            good.getQual(), good.getCost());

   }

}
