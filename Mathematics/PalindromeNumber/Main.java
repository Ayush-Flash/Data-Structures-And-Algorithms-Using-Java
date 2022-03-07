package Mathematics.PalindromeNumber;

import java.util.Scanner;


public class Main {
    
    public static int reverse = 0; 
    
    public static int reverseNumber(int number) {
        if(number == 0) {
            return reverse;
        }
        int mod = number % 10;
        reverse = reverse * 10 + mod;
        number /= 10;
        reverseNumber(number);
        return reverse;
    }
    
    public static void main(String[] args) {
        System.out.println("Program Started");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse = reverseNumber(number);
        if(reverse == number) {
            System.out.println("Palindrome True");
        } else {
            System.out.println("Palindrome False");
        }
    }
}