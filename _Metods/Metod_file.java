package _Metods;
import java.io.*;
public class Metod_file {
   public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(new FileReader("text.txt"))) {
         // чтение посимвольно
         int tx;
         while ((tx = br.read()) != -1) {
         System.out.print((char)tx);

         }

     } catch (IOException ex) {

         System.out.println(ex.getMessage());
     }

     try (BufferedWriter bw = new BufferedWriter(new FileWriter("text.txt"))) {
     String text = "Hello World!\nHey! Teachers! Leave the kids alone.\nda da da\n";
     bw.write(text);
     bw.write(text);
     // bw.append("go go go");
     // bw.append(text);
     } catch (IOException ex) {

     System.out.println(ex.getMessage());
     }
   }
}
