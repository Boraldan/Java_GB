package DZ4;

import java.util.LinkedList;

/**
 * task2_1
 */
public class task2_1 {

   public static void main(String[] args) {
      String myStr = "{({})[]}{(})";
      String myStr2 = "()[]{}()";

      LinkedList<Character> myLiOld = new LinkedList<>();

      for (int i = 0; i < myStr.length(); i++) {
         myLiOld.add(myStr.charAt(i));
      }
      
      System.out.println(CheckEmpty(myLiOld));
   }

   public static boolean CheckEmpty(LinkedList myLi) {
      int n = myLi.size();

      if (n < 1 || n % 2 != 0)
         return false;

      for (int i = 1; i < myLi.size(); i++) {
         if (i - 1 >= 0 && myLi.get(i).equals(')') && myLi.get(i - 1).equals('(')) {
            myLi.remove(i);
            myLi.remove(i - 1);
            i -= 2;
         } else if (i - 1 >= 0 && myLi.get(i).equals(']') && myLi.get(i - 1).equals('[')) {
            myLi.remove(i);
            myLi.remove(i - 1);
            i -= 2;
         } else if (i - 1 >= 0 && myLi.get(i).equals('}') && myLi.get(i - 1).equals('{')) {
            myLi.remove(i);
            myLi.remove(i - 1);
            i -= 2;
         }
      }
      System.out.println(myLi);
      return myLi.isEmpty();
   }
}