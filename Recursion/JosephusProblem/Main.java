package Recursion.JosephusProblem;

import java.util.*;

public class Main {
    
    public int getSurvivor(int numberOfPeople, int passCount) {
        if(numberOfPeople == 1) {
            return 1;
        }
        int smallOutputSurvivor = getSurvivor(numberOfPeople - 1, passCount);
        return (smallOutputSurvivor + passCount - 1) % numberOfPeople;
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int numberOfPeople = sc.nextInt();
            int passCount = sc.nextInt();
            Main mObj = new Main();
            System.out.println(mObj.getSurvivor(numberOfPeople, passCount));
        }
    }
}