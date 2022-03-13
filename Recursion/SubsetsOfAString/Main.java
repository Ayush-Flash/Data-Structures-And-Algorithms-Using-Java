package Recursion.SubsetsOfAString;

import java.util.*;

/**
 * Main
 */
public class Main {

    public List<String> generateSubsets(String str, String emptyStr, int index, List<String> subsets) {
        if(index == str.length()) {
            subsets.add(emptyStr);
            return subsets;
        }
        generateSubsets(str, emptyStr + str.charAt(index),index + 1, subsets);
        generateSubsets(str, emptyStr,index + 1, subsets);
        return subsets;
    }

    public List<String> generateSubsetOfString(String str) {
        List<String> subsets = new ArrayList<>();
        return generateSubsets(str, "", 0, subsets);
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            Main mObj = new Main();
            System.out.println(mObj.generateSubsetOfString(str));
        }
    }
}