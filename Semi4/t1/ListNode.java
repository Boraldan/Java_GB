package Semi4.t1;

import java.util.*;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public int getVal() {
        return val; 
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getListNode() {
        return next;
    }

    public void setListNode(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
       return "el{" + val + "; " + next + " }";
    }


}
