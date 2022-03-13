package Recursion.SumOfDigits;

import java.util.*;

public class Main {
    
    
    public int getSumOfDigitsRecursive(int n) {
        if(n == 0) {
            return 0;
        }
        return (n % 10) + getSumOfDigitsRecursive(n / 10);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Main mObj = new Main();
            int res = mObj.getSumOfDigitsRecursive(n);
            System.out.println(res);
        }
    }
}