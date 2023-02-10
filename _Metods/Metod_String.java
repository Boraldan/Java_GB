package _Metods;

public class Metod_String {
    public static void main(String[] args) {
        
        String str1 = "Привет начало начал.";

        StringBuilder prim = new StringBuilder(); // пустая строка
        StringBuilder sb2 = new StringBuilder(str1); // строка с данными

        prim.append(sb2.substring(0, 2));
        sb2.deleteCharAt(sb2.length()-2);  // удаление символа
        sb2.append(sb2.substring(0, 2), 0, 2);  // добавление в конец

        sb2.insert(0, "c"); // вставить символ

        System.out.println(prim);
        System.out.println(sb2);

        int ind = str1.indexOf("а");  // поиск индекса символа
        System.out.println(ind);


        String hello = "Hello";
        String habr = "habrahabr";
        System.out.println(String.join(", ", hello, habr));  // метод join

        int integerVariable = 10;  // число в строку
        String first = integerVariable + ""; // конкатенация с пустой строкой
        String second = String.valueOf(integerVariable); // вызов статического метода valueOf класса String
        String third = Integer.toString(integerVariable); // вызов метода toString класса-обертки


        String string = "10";  // Строку в число
        int first1 = Integer.parseInt(string); 
        int second2 = Integer.valueOf(string); 

        
    }
}
