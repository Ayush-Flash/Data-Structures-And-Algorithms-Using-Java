package Mathematics.PrimeFactorize;

import java.util.*;

public class Main {

    public static ArrayList<Integer> getPrimeFactors(int number) {
        int copyNumber = number;
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        for(int i = 2 ; i * i <= copyNumber ; i++) {
            while(number % i == 0) {
                primeFactors.add(i);
                number /= i;
            }
        }
        return primeFactors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        ArrayList<Integer> factors = new ArrayList<Integer>();
        factors = getPrimeFactors(number);
        System.out.println(factors); 
    }
}