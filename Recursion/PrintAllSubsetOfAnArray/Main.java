package Recursion.PrintAllSubsetOfAnArray;

import java.util.*;

class Solution {
    public static int subsetSize = 0;
    public ArrayList<ArrayList<Integer>> printAllSubsets(int[] arr, int index, ArrayList<ArrayList<Integer>>subsets) {
        if(index < 0) {
            ArrayList<Integer> tempList = new ArrayList<>();
            subsets.add(subsetSize++, tempList);
            return subsets;
        }
        
        ArrayList<ArrayList<Integer>> smallOutput = printAllSubsets(arr, index - 1, subsets); // O(n)
        
        // Below Task is O(2^n)
        int smallOutputSize = subsetSize;
        for(int i = 0 ; i < smallOutputSize ; i++) { // O(2^n)
            ArrayList<Integer> tempList = new ArrayList<>(smallOutput.get(i));
            tempList.add(arr[index]);
            subsets.add(subsetSize++, tempList);
        }
        return subsets;
    }
    //Overall : O(n * 2^n)
    public void getAllSubsetOfAnArray(int[] arr, int n) {
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<ArrayList<Integer>>();
        subsets = printAllSubsets(arr, n - 1, subsets);
        System.out.println(subsets);
    }
}


public class Main
{
	public static void main(String[] args) {
	    try(Scanner sc = new Scanner(System.in)) {
    		Solution sObj = new Solution();
    		int n = sc.nextInt();
    		int[] arr = new int[n];
    		for(int i = 0 ; i < n ; i++) {
    		    arr[i] = sc.nextInt();
    		}
    		sObj.getAllSubsetOfAnArray(arr, n);
	    }
	}
}
