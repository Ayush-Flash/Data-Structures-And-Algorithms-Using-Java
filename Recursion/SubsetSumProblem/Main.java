package Recursion.SubsetSumProblem;

import java.util.*;

public class Main {
    public static int subsetSumIndex = 0;
    public static List<Integer> getAllSubsetSum(int[] arr, int index, List<Integer> subsetSums,int target) {
        if(index == 0) {
            subsetSums.add(subsetSumIndex, 0);
            subsetSumIndex++;
            subsetSums.add(subsetSumIndex,arr[0]);
            subsetSumIndex++;
            return subsetSums;
        }
        
        List<Integer> smallOutput = getAllSubsetSum(arr, index - 1, subsetSums, target);
        
        int sizeOfSmallOutput = subsetSumIndex;
        for(int i = 0 ; i <= sizeOfSmallOutput - 1  ; i++) {
            subsetSums.add(subsetSumIndex, smallOutput.get(i) + arr[index]);
            subsetSumIndex++;
        }
        return subsetSums;
    }
    
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
		    int count = 0;
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i = 0 ; i < n ; i++) {
		        arr[i] = sc.nextInt();
		    }
		    int target = sc.nextInt();
		    List<Integer>subsets = new ArrayList<>();
		    subsets = getAllSubsetSum(arr,n - 1,subsets, target);
		    for(Integer sum : subsets) {
		        if(sum == target)
		            count++;
		    }
		    System.out.println(count);
		}
	}
}