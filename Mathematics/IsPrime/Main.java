package Mathematics.IsPrime;

import java.util.Scanner;


public class Main {
    public static boolean isPrime(int number) {
        boolean ans = true;
        if(number == 2 || number == 3) {
            return true;
        }
        if(number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for(int i = 5 ; i * i <= number ; i += 6) {
            if(number % i == 0 || (number % (i + 2) == 0)) {
                ans = false;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isPrime(number));
    }
}