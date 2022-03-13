package Recursion.TowerOfHanoi;

import java.util.*;

/**
 * Main
 */
public class Main {

    public void printAllMoves(int n, String source, String aux, String dest) {
        if(n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + dest );
            return;
        }
        printAllMoves(n - 1, source, dest, aux);
        System.out.println("Move disk " + n + " from " + source + " to " + dest);
        printAllMoves(n - 1, aux, source, dest);
    }

    public void printMoves(int n) {
        String source = "A";
        String aux = "B";
        String dest = "C";
        printAllMoves(n, source, aux, dest);
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Main mObj = new Main();
            mObj.printMoves(n);
        }
    }
}