package _test;



public class test_1 {
    public static void main(String[] args) {
        
        // String str1 = "Привет начало начал.";

        // StringBuffer prim = new StringBuffer(); // пустая строка
        // StringBuffer sb2 = new StringBuffer(str1); // строка с данными

        // prim.append(sb2.substring(0, 2));
        // sb2.deleteCharAt(sb2.length()-2);  // удаление символа
        // sb2.append(sb2.substring(0, 2), 0, 2);  // добавление в конец

        // sb2.insert(0, "c"); // вставить символ

        // System.out.println(prim);
        // System.out.println(sb2);

        String  str2 = "  privet  dsafs  ";
        StringBuffer prim2 = new StringBuffer(str2.trim());
        // // String [] str3 = "  privet dsafs  ".replaceAll("(^\\s+|\\s+$)", "").split("\\s+");
        // String [] str3 = "  privet   ds  afs  ".split(" +");
        // System.out.println(str3);
        // for (String string : str3) {
        //     System.out.println(string);
        // }

        System.out.println(prim2);
        
        String [] str4 = str2.replaceFirst(" +", "").split(" +");
        for (String string : str4) {
                       System.out.println(string);
        }
    }
}
