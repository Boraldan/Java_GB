package DZ3.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену
 * товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */

public class Main {
   public static void main(String[] args) {

      Items item = new Items("помидор", 10, 1);
      Items item2 = new Items("огурец высший", 45, 1);
      Items item3 = new Items("баклажа", 17, 1);
      Items item4 = new Items("баклажа высший", 30, 2);
      Items item5 = new Items("чеснок", 9, 1);
      Items item6 = new Items("чесно2к", 8, 3);
      Items item7 = new Items("чеснок3", 7, 4);

      List<Items> arrIt = new ArrayList<>();
      arrIt.add(item);
      arrIt.add(item2);
      arrIt.add(item3);
      arrIt.add(item4);
      arrIt.add(item5);
      arrIt.add(item6);
      arrIt.add(item7);

      Integer costTemp = 0;
      Items goods = arrIt.get(0);
      boolean flag = false;

      for (Items find : arrIt) {
         if ((find.getQual() == 1 || find.getQual() == 2) && find.getName().contains("высший") && find.getCost() > costTemp) {
            goods = find;
            costTemp = find.getCost();
            flag = true;
         }
      }

      if (flag) {
         System.out.printf("Самый дорогой товар с именем 'высший' : %s  цена: %d ", goods.getName(), goods.getCost());
      } else {
         System.out.println("Нет товара с именем 'высший'.");
      }

   }
}
