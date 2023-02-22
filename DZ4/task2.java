package DZ4;

import java.util.*;
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
//  determine if the input string is valid.
public class task2 {
   public static void main(String[] args) {

      String myStr = "({)[]}()";
      String myStr2 = "()[]{}(()";

      String[] arrStr = myStr2.split("");
      LinkedList<String> myLiOld = new LinkedList<>();

      for (String el : arrStr) {
         myLiOld.add(el);
      }
      System.out.println(CheckEmpty(myLiOld));
   }

   public static boolean CheckEmpty(LinkedList myLi) {
      for (int i = 0; i < myLi.size() - 1; i++) {
         if (myLi.get(i).equals("(")) {
            int count = 0;
            for (int j = i + 1; j < myLi.size(); j++) {
               if (myLi.get(j).equals(")") && count%2 ==0 ) {
                  myLi.remove(j);
                  myLi.remove(i);
                  i--;
                  break;
               }
               count++;
            }
         } else if (myLi.get(i).equals("{")) {
            int count = 0;
            for (int j = i + 1; j < myLi.size(); j++) {
               if (myLi.get(j).equals("}") && count%2 ==0 ) {
                  myLi.remove(j);
                  myLi.remove(i);
                  i--;
                  break;
               }
               count++;
            }
         } else if (myLi.get(i).equals("[")) {
            int count = 0;
            for (int j = i + 1; j < myLi.size(); j++) {
               if (myLi.get(j).equals("]") && count%2 ==0 ) {
                  myLi.remove(j);
                  myLi.remove(i);
                  i--;
                  break;
               }
               count++;
            }
         }
      }
      return myLi.isEmpty();
   }
}
