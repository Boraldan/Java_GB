package DZ5;
/**
 *1) Подсчитать количество вхождения каждого слова
Пример:
Россия идет вперед всей планеты. Планета — это не Россия.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task2 {
   public static void main(String[] args) {
      
      String str =  "Россия идет вперед всей планеты. Планета — это не Россия.";
      System.out.println(str);

      String[] strArr2 = str.replaceAll("\\p{P}", " ").trim().toLowerCase().split("\s+");

      Map<String, Integer> myMap = new HashMap<>();

      for (int i = 0; i < strArr2.length; i++) {
         myMap.putIfAbsent(strArr2[i], 0);
         myMap.put(strArr2[i], myMap.get(strArr2[i]) + 1);
      }

      Scanner scan = new Scanner(System.in, "Cp866");
      System.out.print("Ищем: ");
      String text = scan.nextLine().toLowerCase();
 
      System.out.println(text + " --> " + myMap.get(text) + " pc");
   }
   
}
