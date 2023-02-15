package Semi_2.vectors;

public class Main {
   public static void main(String[] args) {

      Vector vect1 = new Vector(100, 11, 10);
      Vector vect2 = new Vector(1, 2, 1);

      System.out.println(vect1.toString());
      System.out.println("длина = " + vect1.length());
      System.out.println(vect1.scal(vect2));
      vect1.print(vect2);
      System.out.println(vect1.vecPr(vect2));
      System.out.println(vect1.sumVec(vect2));
   }
}
