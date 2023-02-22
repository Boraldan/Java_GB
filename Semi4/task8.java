package Semi4;

import java.util.*;
/**
https://leetcode.com/problems/simplify-path/

Input: path = "/home/"
Output: "/home"

Input: path = "/../"
Output: "/"

Input: path = "/home//foo/"
Output: "/home/foo"
 */

public class task8 {
   public static void main(String[] args) {

      String text = "/home//foo/";
      System.out.println(Con(text));
   }

   public static String Con(String path) {

      Deque<String> list = new LinkedList<>();
      String[] arr = path.split("/");
      for (int i = 0; i < arr.length; i++) {
         if (arr[i].equals("") || arr[i].equals("."))
            continue;
         else if (arr[i].equals("..")) {
            if (!list.isEmpty())
               list.pollLast();
         } else
            list.add(arr[i]);
      }
      return "/" + String.join("/", list);
   }
}
