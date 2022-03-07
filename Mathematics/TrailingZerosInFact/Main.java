package Mathematics.TrailingZerosInFact;

import java.util.*;


public class Main {
    public static int numberOfZeros = 0;

    public static int getTrailingZeros(int number) {
        while(number / 5 > 0) {
            numberOfZeros += number / 5;
            number = number / 5;
        }
        return numberOfZeros;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(getTrailingZeros(number));
    }
}