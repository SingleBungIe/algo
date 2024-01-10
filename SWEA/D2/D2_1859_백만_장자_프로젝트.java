/*
뒤에서 부터 값 비교를 할 경우 쉽게 풀 수 있었던 문제
왜 크기가 int가 아닌 long으로 해야 하는지 의문...
 */
package SWEA.D2;

import java.util.Scanner;

public class D2_1859_백만_장자_프로젝트 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            long cost[] = new long[N];
            for (int i = 0; i < N; i++) {
                cost[i] = sc.nextLong();
            }
            long ans = 0;
            long max = cost[N-1];

            for (int i = N-2; i >= 0; i--) {
                if (cost[i] < max)
                    ans += max - cost[i];
                else
                    max = Math.max(cost[i], max);
            }
            System.out.println("#" + test_case + " " + ans);
        }

    }
}
