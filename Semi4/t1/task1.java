package Semi4.t1;

import java.util.*;
import Semi4.t1.ListNode;

public class task1 {
   public static void main(String[] args) {

      ListNode item = new ListNode(1);
      ListNode item2 = new ListNode(2);
      ListNode item3 = new ListNode(3);
      ListNode item4 = new ListNode(4);
      ListNode item5 = new ListNode(5);

      LinkedList<ListNode> myLi = new LinkedList<>();
      myLi.add(item);
      myLi.add(item2);
      myLi.add(item3);
      myLi.add(item4);
      myLi.add(item5);

      ReverseList(myLi.get(0)); 
      System.out.println(myLi);

      for (ListNode el : myLi) {
         System.out.println(el.toString());

      }

   }

   public static ListNode ReverseList(ListNode head) {
      ListNode current = head;
      ListNode pred = null;
      while (current != null) {
         ListNode nextElem = current.next;
         current.next = pred;
         pred = current;
         current = nextElem;
      }
      return pred;
   }

}
