package Mathematics.Factorial;

import java.util.*;

public class Main {

    public static int fact = 1;

    public static int getFactorial(int number) {
        if(number == 0) {
            return 1;
        }
        return number * getFactorial(number - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(getFactorial(number));
    }
}