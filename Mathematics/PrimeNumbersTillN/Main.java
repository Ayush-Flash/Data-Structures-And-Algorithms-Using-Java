package Mathematics.PrimeNumbersTillN;

import java.util.*;

public class Main {
    public static List<Integer> getAllPrimeTillN(int n) {
        List<Integer> sieve = new ArrayList<>(n);
        for(int i = 0 ; i < n ; i++) {
            sieve.add(i , i + 1);
        }
        for(int i = 0 ; i*i < n ; i++) {
            if(i == 0) {
                sieve.set(i, -1);
            } else {
                int key = sieve.get(i);
                for(int j = i + 1 ; j < n ; j++)  {
                    if((key != -1) && (sieve.get(j) % key == 0)) {
                        sieve.set(j, -1);
                    }
                }
            }
        }
       sieve.removeIf(num -> (num == -1));
       return sieve;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getAllPrimeTillN(n));
    }
}