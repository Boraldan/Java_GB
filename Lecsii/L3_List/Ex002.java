package Lecsii.L3_List;

import java.util.ArrayList;

public class Ex002 {

    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList list = new ArrayList();
        list.add(2809);
        list.add("aw");
        list.add(2801);

        System.out.println(list);
        
        for (Object o : list) {
            if (o instanceof Integer) {
                System.out.println(o);
                System.out.println(o.getClass().getName());

            }
        }
    }
}