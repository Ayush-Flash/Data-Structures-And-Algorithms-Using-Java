package Recursion.NaturalNumberSum;

import java.util.*;

public class Main {
    
    public static int sum = 0;
    public static int sumOfNNumbers(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }

        sum = n + sumOfNNumbers(n - 1);
        return sum;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sumOfNNumbers(n);
            System.out.println(sum);
        }
    }
}