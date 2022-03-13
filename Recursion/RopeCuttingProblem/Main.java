package Recursion.RopeCuttingProblem;

import java.util.*;

public class Main {
    
    public int getMaxCuts(int n, int a, int b, int c) {
        if(n == 0) {
            return 0;
        }
        if(n < 0) {
            return -1;
        }
        int cutsA = getMaxCuts(n - a, a, b, c);
        int cutsB = getMaxCuts(n - b, a, b, c);
        int cutsC = getMaxCuts(n - c, a, b, c);
        int possibleAns =  Math.max(cutsA, Math.max(cutsB, cutsC));
        if(possibleAns < 0) {
            return -1;
        }
        return possibleAns + 1;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            Main hObj = new Main();
            int ans = hObj.getMaxCuts(n, a, b, c);
            System.out.println(ans);
        }
    }
}