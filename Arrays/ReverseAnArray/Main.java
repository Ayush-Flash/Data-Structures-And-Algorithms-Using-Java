package Arrays.ReverseAnArray;

import java.util.*;

class Solution {
    public int[] reverseArray(int[] arr, int n) {
        for(int i = 0 ; i < (n / 2) ; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        return arr;
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
            System.out.println(Arrays.toString(sObj.reverseArray(arr, n)));
        }    
    }
}