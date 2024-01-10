/*
Math.round() 함수를 통해 반올림 할 수 있음을 알아두자
 */

package SWEA.D1;

import java.util.Scanner;

public class D1_2071_평균값_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            double sum = 0;
            for (int i = 0; i < 10; i++) {
                int a = sc.nextInt();
                sum += a;
            }

            sum = Math.round(sum /= 10);
            System.out.println("#" + test_case + " " + (int)sum);
        }
    }
}
