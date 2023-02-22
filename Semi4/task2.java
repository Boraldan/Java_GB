package Semi4;

import java.util.*;

/**
 * task2
 */
public class task2 {
     
      public static void main(String[] args) {
         LinkedList<Integer> linkedList = new LinkedList<>();
         Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
         for (int i = 0; i < n; i++) {
             linkedList.add(i);
         }
         scanner.close();
         //показать/достать элемент
         System.out.println(linkedList.peek());
         System.out.println("peek: "+linkedList);
         System.out.println(linkedList.pop());
         System.out.println("pop "+ linkedList);
         //добавление в начало / в конец
         linkedList.addFirst(3);
         System.out.println("addFirst: "+linkedList);
         linkedList.addLast(4);
         System.out.println("addLast: "+linkedList);
         linkedList.add(5);
         System.out.println("add: "+linkedList);
         //замена
         linkedList.set(0,7);
         System.out.println("set 7 : "+linkedList);
         // проверка на наличие элемента
         System.out.println("contains 7 " + linkedList.contains(7));
         //удаление
         linkedList.remove(4);
         System.out.println("delete : "+linkedList);

   }
}