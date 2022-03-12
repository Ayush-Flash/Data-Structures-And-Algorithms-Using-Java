package Mathematics.Power;

import java.util.*;

public class Main {

    public static int ans = -1;

    public static int calculate(int x, int y) {
        if(y == 0) {
            return 1;
        }
        if(y == 1) {
            return x;
        }
        int halfExpo = calculate(x, y / 2);
        int ans = halfExpo * halfExpo;
        if(y % 2 != 0) {
            ans *= x;  
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(calculate(x, y));
    }
}