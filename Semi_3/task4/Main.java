package Semi_3.task4;

import java.util.*;
/** 4.	 Напишите метод, который на вход получает коллекцию объектов, 
 * а возвращает коллекцию уже без дубликатов.
 */

 public class Main {
   public static void main(String[] args) {

      Items items = new Items(3, "желтый", "деревянный");
      Items items2 = new Items(3, "зеленый", "металлический");
      Items items3 = new Items(4, "красный", "картонный");
      Items items4 = new Items(4, "красный", "картонный");

      List<Items> itemsList = new ArrayList<>();
      itemsList.add(items);
      itemsList.add(items2);
      itemsList.add(items3);
      itemsList.add(items4);
      System.out.println(itemsList);
      System.out.println("Уникальный список = "+ unicumCollection(itemsList));
      
  }

  private static Collection unicumCollection(List<Items> itemsList) {
      return new HashSet(itemsList);
  }
   }

