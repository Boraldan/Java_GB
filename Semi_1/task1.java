package Semi_1;
/**
Given an integer number n, return the difference between the product of its digits and the sum of its digits. 
Дано целое число n, верните разницу между произведением его цифр и суммой его цифр.
 */


import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число: ");
    int n = scanner.nextInt();
    int sum = 0;
    int pr = 1;
    while (n!=0){
        pr *= n%10;
        sum += n%10;
        n /= 10;
    }
    System.out.println(pr-sum);


}
}