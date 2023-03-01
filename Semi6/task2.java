package Semi6;

import java.util.*;

/**
 * 2) Найти пересечение двух множеств
Пример:
set1= [1,2,3,4]
set2= [3,5,6,7]

 */
public class task2 {
   public static void main(String[] args) {
      
      ArrayList <Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,9,2,11,5));
      ArrayList <Integer> list2 = new ArrayList<>(Arrays.asList(6,7,8,3,2,11,5));

      Set <Integer> setList1 = new HashSet<>(list1);
      Set <Integer> setLis2 = new HashSet<>(list2);
      
      System.out.println(setList1);
      
      setList1.retainAll(setLis2);
      System.out.println(setList1);
      
    
   }
   
}
