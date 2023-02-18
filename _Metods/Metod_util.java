package _Metods;

import java.util.*;

public class Metod_util {
   public static void main(String[] args) {
      
      // разделяет строку добавляя в последовательность --------------
      String toParse = "word1;word2;word3;word4";
      StringTokenizer st = new StringTokenizer(toParse,";");
      while(st.hasMoreTokens()) {
          System.out.println(st.nextToken());        }


      // * Проверака Object на тип данных ---------------------
      // ArrayList<Integer> list = new ArrayList<Integer>();
      ArrayList list = new ArrayList();
      list.add(2809);
      list.add("aw");
      for (Object o : list) {
         if (o instanceof Integer) {   // <--- этот оператор
               System.out.println(o);
               System.out.println(o.getClass().getName());  }}

      // * Сортировка списка         -------------------
      Collections.sort(list);
      Collections.sort(list, Collections.reverseOrder());

      // * Преобразование List в массив  ------------------
      List<String> wordsList = Arrays.asList("I", "love", "learning", "on", "JavaRush");
      String[] wordsArray = wordsList.toArray(new String[0]);
      // Integer [] arr2 = list.toArray(new Integer[0]);
      
      String[] strings = wordsList.stream()  // функция стрим с дом методами в массив
      .filter(str -> str.length() > 2)  // метод фильтрации
      .map(str -> str.toUpperCase())     // преобразования функцией
      .toArray(String[]::new);            // запись в новый массив

   }
   
}
