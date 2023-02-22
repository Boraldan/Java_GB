package DZ4;

import java.util.*;

public class task1 {
   public static void main(String[] args) {

      LinkedList<Integer> myLi = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
      System.out.println(myLi);
      for (int i = 0; i < myLi.size() - 1; i++) {
         int el = myLi.pollLast();
         myLi.add(i, el);
      }
      System.out.println(myLi);
   }
}
