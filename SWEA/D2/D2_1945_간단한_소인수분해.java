/*
N이 주어진 수로 나누었을 때 나머지가 0이라면
N이 1이 될 때 까지 주어진 수들로 반복해서 나누어 준 후
나눌 때 마다 주어진 수들의 카운터를 증가 시킨다.
 */
package SWEA.D2;

import java.util.Scanner;

public class D2_1945_간단한_소인수분해 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;

            while (true) {
                if (N % 2 == 0) {
                    N = N / 2;
                    a++;
                } else if (N % 3 == 0) {
                    N = N / 3;
                    b++;
                } else if (N % 5 == 0) {
                    N = N / 5;
                    c++;
                } else if (N % 7 == 0) {
                    N = N / 7;
                    d++;
                } else if (N % 11 == 0) {
                    N = N / 11;
                    e++;
                }

                if (N == 1) break;
            }
            System.out.printf("#%d %d %d %d %d %d", test_case, a, b, c, d, e);
        }
    }
}
