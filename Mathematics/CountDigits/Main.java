package Mathematics.CountDigits;

import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static int numberOfDigits = 0;
    
    public static int countDigitsInAnumber(int number) {
        numberOfDigits++;
        if(number / 10 ==  0){
            return numberOfDigits;
        }
        number = number / 10;
        return countDigitsInAnumber(number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Number received is " + n1);
        System.out.println("Digits in above number are " +countDigitsInAnumber(n1));
    }
}