package DZ2;

/*Требования Отвалидировать доску судоку
        Объявлена доска 9 x 9 необходимо отвалидировать в соответствии с правилами
        1.	Каждая строка должна содержать цифру 1-9 без повторения
        2.	Каждая колонка должна содержать цифру 1-9 без повторения
        3.	Каждый под блок из 9 элементов 3 x 3 должна содержать цифру 1-9 без повторения
        Ограничения
        •	board.length == 9
        •	board[i].length == 9
        •	board[i][j] значение число или '.'
*/

public class Sudoku {
   public static void main(String[] args) {

      var s = System.currentTimeMillis();
      char[][] board = {
            { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
            { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
            { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
            { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
            { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
            { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
            { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
            { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
            { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

      // System.out.println("Validete:" + isValidSudoku(board));

      char[] chArr = new char[9];
      char[] colArr = new char[9];
      boolean flag = true;

      for (int k = 0; k < 9; k += 3) {
         for (int l = 0; l < 9; l += 3) {
            int iCh = 0;
            for (int i = k; i < k + 3; i++) {
               for (int j = l; j < l + 3; j++) {
                  chArr[iCh] = board[i][j];
                  iCh++;
               }
            }
            flag = Check(chArr);
            if (flag == false) {
               break;
            }
         }
         if (flag == false)
            break;
      }

      if (flag) {
         for (int i = 0; i < 9; i++) {
            int iCh = 0;
            for (int j = 0; j < 9; j++) {
               chArr[iCh] = board[i][j];
               colArr[iCh] = board[j][i];
               iCh++;
            }
            flag = Check(chArr);
            if (flag == false) {
               break;
            }

            flag = Check(colArr);
            if (flag == false) {
               break;
            }
         }
      }

      if (flag)
         System.out.println("Поле заполнено верно!");
         
      System.out.println(System.currentTimeMillis() - s);
   }

   public static boolean Check(char[] arr) {
      int count = 0;
      for (int i = 0; i < arr.length; i++) {
         count = 0;
         char temp = arr[i];
         if (temp != '.') {
            for (char el : arr) {
               if (temp == el) {
                  count++;
                  if (count > 1) {
                     System.out.printf("Найден повторяющийся элемент - %s\n", el);
                     return false;
                  }
               }
            }
         }

      }
      return true;
   }

}
