package Recursion.PalindromeCheck;

import java.util.*;


public class Main {
    public Boolean checkRecursivePalindrome(String str,int start, int end) {
        if(end == 0 || end == 1) {
            return true;
        }
        if(start >= end) {
            return true;
        }
        if(str.charAt(start) == str.charAt(end)) {
            return checkRecursivePalindrome(str, start + 1, end - 1);
        } else {
            return false;
        }
    }
    public void isPalindrome(String str) {
        int lenghtOfString = str.length();
        System.out.println(checkRecursivePalindrome(str, 0, lenghtOfString - 1));
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            Main mObj = new Main();
            mObj.isPalindrome(str);
        }
    }
}