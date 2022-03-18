package Recursion.PrintAllPermutations;

import java.util.*;
class Solution {
    public List<String> findAllPermutations(String str, int index, List<String> permutations) {
        if(index < 0) {
            permutations.add("");
            return permutations;
        }
        
        List<String> smallerOutput = findAllPermutations(str, index - 1, permutations);
        int k = 0;
        permutations = new ArrayList();
        for(String permutation : smallerOutput) {
            for(int i = 0 ; i <= permutation.length() ; i++) {
                String tempStr = permutation.substring(0, i) + str.charAt(index) + permutation.substring(i);
                permutations.add(k, tempStr);
                k++;
            }    
        }
        return permutations;
    }
    
    public List<String> generateAllPermutations() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int lengthOfString = str.length();
        List<String> permutations = new ArrayList<>();
        return findAllPermutations(str, lengthOfString - 1, permutations);
    }
}

public class Main
{
	public static void main(String[] args) {
        Solution oSol = new Solution();
        List<String> permutations = oSol.generateAllPermutations();
        System.out.println(permutations);
        System.out.println(permutations.size());
	}
}