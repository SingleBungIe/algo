package D2;

import java.util.Scanner;

public class D2_1976_시각_덧셈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();

            int hSum = h1 + h2;
            int mSum = m1 + m2;

            if (hSum > 12) {
                if (hSum % 12 == 0)
                    hSum = 12;
                else
                    hSum %= 12;
            }
            if (mSum >= 60) {
                hSum += (mSum / 60);
                mSum %= 60;
            }
            System.out.printf("#%d %d %d\n", test_case, hSum, mSum);
        }
    }
}
