package DZ6;

import java.util.*;
import java.util.Scanner;

public class Func {

   public static Set<Items> mySet() {

      Items item = new Items("Asus Zen", 20000, 4, 250, 15, "Windows");
      Items item2 = new Items("Asus Zen", 50000, 16, 1000, 15, "Windows");
      Items item3 = new Items("Macbook", 70000, 8, 500, 13, "MacOS");
      Items item4 = new Items("Macbook", 70000, 8, 500, 15, "MacOS");
      Items item5 = new Items("Dell", 45000, 16, 1000, 16, "Windows");
      Items item6 = new Items("Dell", 35000, 8, 500, 13, "DOS");
      Items item7 = new Items("HP", 35000, 8, 500, 14, "DOS");
      Items item8 = new Items("HP", 75000, 32, 1000, 16, "Windows");

      Set<Items> nbSet = new HashSet<>();
      nbSet.add(item);
      nbSet.add(item2);
      nbSet.add(item3);
      nbSet.add(item4);
      nbSet.add(item5);
      nbSet.add(item6);
      nbSet.add(item7);
      nbSet.add(item8);

      return nbSet;
   }

   public static void addItem(Set<Items> notebook) {
      Scanner scan = new Scanner(System.in, "Cp866");
      System.out.print("Введите имя: ");
      String str = scan.nextLine().toLowerCase();
      System.out.print("Введите цену: ");
      int num = scan.nextInt();
      System.out.print("Введите количество памяти DDR: ");
      int num2 = scan.nextInt();
      System.out.print("Введите объем HDD: ");
      int num3 = scan.nextInt();
      System.out.print("Введите размер экрна (14, 15, 16): ");
      int num4 = scan.nextInt();
      System.out.print("Введите операционную систему: ");
      String str3 = scan.nextLine().toLowerCase();
      String str2 = scan.nextLine().toLowerCase();
      Items item = new Items(str, num, num2, num3, num4, str2);
      notebook.add(item);
   }

   public static int Exit(int n) {
      return 0;
   }

   public static void FindName(Set<Items> nb, int chNum) {
      Scanner scan = new Scanner(System.in, "Cp866");
      System.out.print("Введите запрос поиска: ");
      String str = scan.nextLine().toLowerCase();
      boolean flag = true;
      if (chNum == 1) {
         for (Items el : nb) {
            if (el.getName().toLowerCase().contains(str)) {
               UserF.ItemPrint(el);
               flag = false;
            }
         }
      } else if (chNum == 6) {
         for (Items el : nb) {
            if (el.getSoft().toLowerCase().contains(str)) {
               System.out.println(el.getName() + ", цена: " + el.getCost() + ", DDR: " + el.getDdr()
                     + "Gb, HDD: " + el.getHdd() + "Gb, дисплей: " + el.getScrin() + ", система: [ " + el.getSoft()
                     + " ]");
               flag = false;
            }
         }
      }
      if (flag)
         System.out.println("---> C запрошенными параметрами нет ноутбука.\n");
      return;
   }

   public static void DellItem(Set<Items> nb) {
      Set<Items> tempSet = new HashSet<>();
      Scanner scan = new Scanner(System.in, "Cp866");
      System.out.print("Введите имя для удаления: ");
      String str = scan.nextLine().toLowerCase();
      boolean flag = true;
      for (Items el : nb) {
         if (el.getName().toLowerCase().contains(str)) {
            System.out.println(el.getName() + ", цена: " + el.getCost() + ", DDR: " + el.getDdr()
                  + "Gb, HDD: " + el.getHdd() + "Gb, дисплей: " + el.getScrin() + ", система: " + el.getSoft()
                  + "      <--- удален");
            tempSet.add(el);
            flag = false;
         }
      }
      nb.removeAll(tempSet);
      if (flag)
         System.out.println("---> С таким именем нет ноутбуков.\n");
      return;
   }

   public static void FindValue(Set<Items> nb, int chNum) {
      System.out.println();
      Scanner scan = new Scanner(System.in, "Cp866");
      System.out.print("Введите диапазон поиска:   (например: от 10 до 20) -->  ");
      String str = "0 ";
      str += scan.nextLine();
      String[] arrNum = str.replaceAll("\\D", " ").trim().split("\s+");
      int n1 = 0;
      int n2 = 0;
      if (arrNum.length > 2) {
         n1 = Integer.parseInt(arrNum[1]);
         n2 = Integer.parseInt(arrNum[2]);
      } else if (arrNum.length == 2) {
         n2 = Integer.parseInt(arrNum[1]);
      }
      System.out.printf("\n...поиск от %d до %d\n", n1, n2);
      boolean flag = true;
      if (chNum == 2) {
         for (Items el : nb) {
            if (el.getCost() >= n1 && el.getCost() <= n2) {
               System.out.println(el.getName() + ", цена: [ " + el.getCost() + " ], DDR: " + el.getDdr()
                     + "Gb, HDD: " + el.getHdd() + "Gb, дисплей: " + el.getScrin() + ", система: " + el.getSoft());
               flag = false;
            }
         }
      } else if (chNum == 3) {
         for (Items el : nb) {
            if (el.getDdr() >= n1 && el.getDdr() <= n2) {
               System.out.println(el.getName() + ", цена: " + el.getCost() + ", DDR: [ " + el.getDdr()
                     + "Gb ], HDD: " + el.getHdd() + "Gb, дисплей: " + el.getScrin() + ", система: " + el.getSoft());
               flag = false;
            }
         }
      } else if (chNum == 4) {
         for (Items el : nb) {
            if (el.getHdd() >= n1 && el.getHdd() <= n2) {
               System.out.println(el.getName() + ", цена: " + el.getCost() + ", DDR: " + el.getDdr()
                     + "Gb, HDD: [ " + el.getHdd() + "Gb ], дисплей: " + el.getScrin() + ", система: " + el.getSoft());
               flag = false;
            }
         }
      } else if (chNum == 5) {
         for (Items el : nb) {
            if (el.getDdr() >= n1 && el.getDdr() <= n2) {
               System.out.println(el.getName() + ", цена: " + el.getCost() + ", DDR: " + el.getDdr()
                     + "Gb, HDD: " + el.getHdd() + "Gb, дисплей: [ " + el.getScrin() + " ], система: " + el.getSoft());
               flag = false;
            }
         }
      }
      if (flag)
         System.out.println("---> C запрошенными параметрами нет ноутбука.\n");
      else
         System.out.println();
      return;
   }

}
