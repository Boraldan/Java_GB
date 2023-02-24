package DZ5;

import java.util.HashMap;
import java.util.Map;


/**
 * 1) Подсчитать количество вхождения каждого слова
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 */

public class task1 {
   public static void main(String[] args) {

      String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
      String[] strArr = str.replaceAll("\\P{L}", " ").toLowerCase().split("\s+");

      Map<String, Integer> myMap = new HashMap<>();

      for (int i = 0; i < strArr.length; i++) {
         myMap.putIfAbsent(strArr[i], 0);
         myMap.put(strArr[i], myMap.get(strArr[i]) + 1);
      }

      for (var entry : myMap.entrySet()) {
         System.out.println(entry.getKey() + " ---> " + entry.getValue() + " раз(а)");
      }
   }
}
