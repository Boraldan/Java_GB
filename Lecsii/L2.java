package Lecsii;

import java.io.BufferedReader;
import java.io.File;

/**
 * L2
 */
public class L2 {

   public static void main(String[] args) {

      var s = System.currentTimeMillis();
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < 1_00000; i++) {
         sb.append("+");
      }
      System.out.println(System.currentTimeMillis() - s);

      /**
       * concat():         объединение строк
       * valueOf():        преобразует Object в строковое представление (завязан на
       * toString())
       * join():           объединяет набор строк в одну с учетом разделителя
       * charAt():         получение символа по индексу
       * indexOf():        первый индекс вхождения подстроки
       * lastIndexOf():    последний индекс вхождения подстроки
       * startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
       * replace():        замена одной подстроки на другую
       * trim():           удаляет начальные и конечные пробелы
       * substring():      возвращает подстроку, см.аргументы
       * toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем  регистре
       * сompareTo():      сравнивает две строки
       * equals():         сравнивает строки с учетом регистра
       * equalsIgnoreCase(): сравнивает строки без учета регистра
       * regionMatches():  сравнивает подстроки в строках
       **/

      // ----------------------
      String[] name = { "C", "е", "р", "г", "е", "й" };
      String sk = "СЕРГЕЙ КА.";
      System.out.println(sk.toLowerCase()); // сергей ка.
      System.out.println(String.join("", name)); // Cергей
      System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));

      // ----------------------------
      try {
         String pathProject = System.getProperty("user.dir");
         String pathFile = pathProject.concat("/file.txt");
         File f3 = new File(pathFile);
         System.out.println("try");
      } catch (Exception e) {
         System.out.println("catch");
      } finally {
         System.out.println("finally");
      }
      // ----------------------------
      try {
         String pathProject = System.getProperty("user.dir");
         String pathFile = pathProject.concat("/file.txt");
         File file = new File(pathFile);
         if (file.createNewFile()) {
         System.out.println("file.created");
         }
         else {
         System.out.println("file.existed");
         }
         } catch (Exception e) {
         System.out.println("catch");
         } finally {
         System.out.println("finally")
      // -------------------------------
         String line = "empty";
         try {
         File file = new File(pathFile);
         if (file.createNewFile()) {
         System.out.println("file.created"); }
         else {
         BufferedReader bufReader =
         new BufferedReader(new FileReader(file));
         System.out.println("file.existed");
         line = bufReader.readLine();
         bufReader.close(); }
         } catch (Exception e) {
         //e.printStackTrace();
         } finally {
         System.out.println(line);
         }

         /* 
         * Работа с файловой системой
         isHidden():          возвращает истину, если каталог или файл является скрытым
         length():            возвращает размер файла в байтах
         lastModified():      возвращает время последнего изменения файла или каталога
         list():              возвращает массив файлов и подкаталогов, которые находятся в каталоге
         listFiles():         возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
         mkdir():             создает новый каталог
         renameTo(File dest): переименовывает файл или каталог
         */
         

         // * Работа с файловой системой. Каталоги

         String pathProject = System.getProperty ("user.dir" );
         String pathDir = pathProject .concat("/files");
         File dir = new File(pathDir);
         System.out.println(dir.getAbsolutePath ());
         if (dir.mkdir()) {
         System.out.println("+");
         } else {
         System.out.println("-");
         }
         for (String fname : dir.list()) {
         System.out.println(fname);
         } 






   }
}