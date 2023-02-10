package DZ1;

import java.util.Scanner;

public class tasc1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        // String [] arStr = str.replaceAll("(^\\s+|\\s+$)", "").split("\\s+");
        String [] arStr = str.trim().split("\s+");

        String [] newStr = new String [arStr.length]; 
        int n = arStr.length;
        for (int i = 0; i < n; i++) {
            newStr[i] = arStr[n-i-1];
        }   

        for (String string : newStr) {
            System.out.printf("%s ", string);
        }
        

    }
}
