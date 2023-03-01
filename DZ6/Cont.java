package DZ6;

import java.util.*;
import java.util.Scanner;

public class Cont {

   public static void StartMenu(Set<Items> noteB) {
      Scanner scan = new Scanner(System.in, "Cp866");
      UserF.MenuPrint();
      int num = scan.nextInt();
      if (num == 1) {
         UserF.ListPrint(noteB);
      } else if (num == 2) {
         Func.addItem(noteB);
         UserF.ListPrint(noteB);
      } else if (num == 3) {
         UserF.FindPrint();
         num = scan.nextInt();
         if (num == 1 || num == 6) {
            Func.FindName(noteB, num);
         } else if (num == 2 || num == 3 || num == 4 || num == 5) {
            Func.FindValue(noteB, num);
         }
      } else if (num == 4) {
         Func.DellItem(noteB);
      }
      if (num == 0) {
         return;
      }
      StartMenu(noteB);
   }
}
