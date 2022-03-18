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

    public static int subsetIndex = 0;

    public String[] generateSubsetsIntutive(String str, int currentIndex, String[] subsets) {
        if(currentIndex < 0) {
            subsets[subsetIndex++] = "";
            return subsets;
        }

        String[] smallerSubsets = generateSubsetsIntutive(str, currentIndex - 1, subsets);

        int currentSmallOutputSize = subsetIndex;
        for(int i = currentSmallOutputSize ; i > 0 ; i--) {
            subsets[subsetIndex++] = smallerSubsets[currentSmallOutputSize - i] + str.charAt(currentIndex);
        }
        return subsets;
    }

    public List<String> generateSubsetOfString(String str) {
        List<String> subsets = new ArrayList<>();
        return generateSubsets(str, "", 0, subsets);
    }

    public void fun(String str) {
        int currentIndex = str.length() - 1;
        String[] subsets = new String[(int)Math.pow(2, currentIndex + 1)];
        subsets =  generateSubsetsIntutive(str, currentIndex, subsets);
        for(String s : subsets) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            Main mObj = new Main();
            System.out.println(mObj.generateSubsetOfString(str));
            //mObj.fun(str);
        }
    }
}