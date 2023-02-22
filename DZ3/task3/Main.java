package DZ3.task3;

import java.util.*;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и
 * количества страниц.
 * Найти названия книг, в которых простое количество страниц, фамилия автора
 * содержит «А» и
 * год издания после 2010 г, включительно.
 */
  
public class Main {

 
   public static void main(String[] args) {

      Items item = new Items("Война и Мир", "Толстой", 5, 1851, 1999);
      Items item2 = new Items("Умный пискарь", "Салтыков-Шедрин", 350, 2014, 523);
      Items item3 = new Items("Евгений Онегин", "Пушкин", 300, 2015, 500);
      Items item4 = new Items("Машины Java", "Иванова", 150, 1979, 109);
      Items item5 = new Items("Только вперёд", "Сидоров", 50, 2000, 100);
      Items item6 = new Items("Первый снег", "Антонов", 370, 2010, 709);
      Items item7 = new Items("В путь!", "Амбаров", 1, 2009, 120);

      List<Items> arrIt = new ArrayList<>();
      arrIt.add(item);
      arrIt.add(item2);
      arrIt.add(item3);
      arrIt.add(item4);
      arrIt.add(item5);
      arrIt.add(item6);
      arrIt.add(item7);

      for (Items el : arrIt) {
         if (el.getAvtor().toLowerCase().contains("а") && el.getYear() > 2009 && Check(el.getPage())) {
            System.out.println(el);
         }
      }
   }

   public static boolean Check(int num) {
      if (num == 2 || num == 3)
         return true;
      else if (num % 2 == 0)
         return false;
      for (int i = 3; i < num; i += 2)
         if (num % i == 0)
            return false;
      return true;
   }

}