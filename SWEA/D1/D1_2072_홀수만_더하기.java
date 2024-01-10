/*
나머지가 1인 수는 홀수라는 걸 까먹지 말자
 */
package SWEA.D1;

import java.util.Scanner;

public class D1_2072_홀수만_더하기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                int a = sc.nextInt();
                if (a % 2 == 1) {
                    sum += a;
                }
            }
            System.out.println("#" + test_case + " " + sum);
        }


    }
}

