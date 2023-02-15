package Lecsii;

import java.net.SocketPermission;
import java.util.Scanner;

public class L1 {

    public static void main(String[] args) {

        System.out.println();
        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e); // 2.7
        System.out.println(pi);

        char ch = '1';
        System.out.println(Character.isDigit(ch)); // true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); // false

        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // fals

        String msg = "Hello world";
        System.out.println(msg); // Hello worl

        var a = 123;
        System.out.println(a); // 123
        var d = 123.456;
        System.out.println(d); // 123.456
        System.out.println(getType(a)); // Integer
        System.out.println(getType(d)); // Double
        d = 1022;
        System.out.println(d); // 1022
        // d = "mistake";
        // error: incompatible types:
        // String cannot be converted to double

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -214748364

        String s = "qwerty";
        s.charAt(1);

        a = 123;
        int b = 123;
        a = a-- - --a;
        b = --b - b--;
        System.out.println(a);
        System.out.println(b);

        /*
         * Операции Java
         * ● Присваивание: =
         * ● Арифметические: *, /, +, -, %, ++, --
         * ● Операции сравнения: <, >, ==, !=, >=, <=
         * ● Логические операции: ||, &&, ^, !
         * ● Побитовые операции <<, >>, &, |, ^
         */

        int[] arr = new int[10];
        System.out.println(arr.length); // 10
        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); // 5

        int[] arr2[] = new int[3][5];
        for (int[] line : arr2) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }

        int i = 123;
        double d2 = i;
        System.out.println(i); // 123
        System.out.println(d2); // 123.0
        d2 = 3.1415;
        i = (int) d2;
        System.out.println(d2); // 3.1415
        System.out.println(i); // 3
        d2 = 3.9415;
        i = (int) d2;
        System.out.println(d2); // 3.9415
        System.out.println(i); // 3
        byte b2 = Byte.parseByte("123");
        System.out.println(b2); // 123
        b2 = Byte.parseByte("1234");
        System.out.println(b2); // NumberFormatException: Value out of range

        // Получение данных из терминала ------------
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        // iScanner.close();

        System.out.printf("int a: ");
        int x = iScanner.nextInt();
        System.out.printf("double a: ");
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        // iScanner.close();

        // Проверка на соответствие получаемого типа --------------
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        int i2 = iScanner.nextInt();
        System.out.println(i2);
        iScanner.close();

        // Форматированный вывод ----------------------
        int a3 = 1, b3 = 2;
        int c = a3 + b3;
        String res = a3 + " + " + b3 + " = " + c;
        System.out.println(res);

        int a4 = 1, b4 = 2;
        int c4 = a4 + b4;
        String res4 = String.format("%d + %d = %d \n", a4, b4, c4);
        System.out.printf("%d + %d = %d \n", a4, b4, c4);
        System.out.println(res4);

        /*
         * Виды спецификаторов ------------------------
         * %d: целочисленных значений
         * %x: для вывода шестнадцатеричных чисел
         * %f: для вывода чисел с плавающей точкой
         * %e: для вывода чисел в экспоненциальной форме,
         * например, 3.1415e+01
         * %c: для вывода одиночного символа
         * %s: для вывода строковых значений
         */

        float pi2 = 3.1415f;
        System.out.printf("%f\n", pi2); // 3,141500
        System.out.printf("%.2f\n", pi2); // 3,14
        System.out.printf("%.3f\n", pi2); // 3,141
        System.out.printf("%e\n", pi2); // 3,141500e+00
        System.out.printf("%.2e\n", pi2); // 3,14e+00
        System.out.printf("%.3e\n", pi2); // 3,141e+00

        // Функции и методы ------------
        sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0

        // Управляющие конструкции:
        // условный оператор -----------------
        int a5 = 1;
        int b5 = 2;
        int c5;
        if (a5 > b5) {
            c5 = a5;
        } else {
            c5 = b5;
        }
        System.out.println(c5);

        // if (a > b) c = a;
        // if (b > a) c = b

        // int min = a < b ? a : b;
        // System.out.println(min);

        // Циклы -----------------------
        int value = 321;
        int count = 0;
        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);

        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);

        for (int k = 0; k < 5; k++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Перебор цикла -------------
        int arr3[] = new int[10];
        for (int item : arr3) // перебор цикла
        {
            System.out.printf("%d ", item);
        }
        System.out.println();

    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }

    // Функции и методы ------------
    static void sayHi() {
        System.out.println("hi!");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double factor(int n) {
        if (n == 1)
            return 1;
        return n * factor(n - 1);
    }

}