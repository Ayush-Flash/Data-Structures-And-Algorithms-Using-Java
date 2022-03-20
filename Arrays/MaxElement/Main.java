package Arrays.MaxElement;

import java.util.*;

class Solution {
    public int findMaxElement(int[] arr, int n) {
        int currentMax = -1;
        int previousMax = -1;
        for(int i = 0 ; i < n; i++) {
            if(arr[i] > currentMax) {
                previousMax = currentMax;
                currentMax = arr[i];
            } else if(arr[i] > previousMax) {
                previousMax = arr[i];
            }
        }
        return currentMax;
    }
}

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++) {
                arr[i] = sc.nextInt();
            }
            Solution sObj = new Solution();
            System.out.println(sObj.findMaxElement(arr, n));
        }
    }
}
