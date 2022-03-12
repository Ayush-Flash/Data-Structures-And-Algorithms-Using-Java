package Recursion.PrintNumbers;

import java.util.*;

public class Main {

    public static void printNumberReverse(int n) {
        if(n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printNumberReverse(n - 1);
    }

    public static void printNumbers(int n) {
        if(n == 1) {
            System.out.print(n + " ");
            return;
        }
        printNumbers(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumbers(n);
        System.out.println();
        printNumberReverse(n);
        System.out.println();
    }
    
}