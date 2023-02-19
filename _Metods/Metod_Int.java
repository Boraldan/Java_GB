package _Metods;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Metod_Int {
   public static void main(String[] args) {
      System.out.print("\033\143"); // очистка терминала

      // * проверяем длину  числа
      int arr[] = {78, -9, 2345, 89009, 1, 34, 1000, 2749};  
      // число должно быть положительным перед проверкой. варианты:
      int len = (int) (Math.log10(Math.abs(arr[3])) + 1);     
      System.out.println(len);

      Integer.toString(arr[1]).length();
      String.valueOf(arr[0]).length();
      Math.floor(Math.log10(Math.abs(arr[1])) + 1); // здесь число берётся по модулю

      // * рандомное число --------------  RANDOM
      int rx = (int)(Math.random()*100);
      System.out.println(rx);
      // рандом с через ints-------------
      List<Integer> intList = new Random().ints(5, 1, 11) 
      .boxed().collect(Collectors.toList()); 
      System.out.println(intList); 
      // еще вариант с извлечение числа из потока -----------
      int randomInt = new Random().ints(1, 1, 11).findFirst().getAsInt(); 
      System.out.println(randomInt); 





   }
}
