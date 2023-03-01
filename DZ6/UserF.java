package DZ6;

import java.util.*;

public class UserF {

   public static void MenuPrint() {
      String str = """
                Выберите пунк меню:
            1 - Показать список ноутбуков
            2 - Добавить в базу ноутбук
            3 - Поиск ноутбука по параметру
            4 - Удалить по названию
            0 - Выход из программы
               """;
      System.out.println(str);
   }

   public static void ListPrint(Set<Items> list) {
      for (Items el : list) {
         ItemPrint(el);
      }
   }

   public static void FindPrint() {
      String str = """
            Выберите параметр поиска по:
            1 - названию
            2 - стоимости
            3 - размеру DDR
            4 - объему HDD
            5 - размеру дисплея
            6 - операционной системе
            0 - выход
            """;
      System.out.println(str);
   }

   public static void ItemPrint(Items el) {
      System.out.println(el.getName() + ", цена: " + el.getCost() + ", DDR: " + el.getDdr()
            + "Gb, HDD: " + el.getHdd() + "Gb, дисплей: " + el.getScrin() + ", система: " + el.getSoft());
      return;
   }

}
