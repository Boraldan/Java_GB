package DZ1;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int start = -1;
        int sum = 0;

        if (n1 != 0) {
            while (start != 0) {
                int n2 = scan.nextInt();
                start = n2;
                if (n1 > 0 && n2 < 0) {
                    sum += n1;
                }
                n1 = n2;

            }
            System.out.printf("Сумма = %s", sum);
        }
        else {
            System.out.printf("Сумма = %s", sum);
        }

    }
}
