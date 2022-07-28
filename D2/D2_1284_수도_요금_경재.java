/*
A회사의 경우 항상 한 달 수도의 양(W) * 1L당 요금(P)
B회사의 경우
한 달 수도의 양이 기본 요금을 초과 했다면
기본 요금(Q) + (한 달 수도의 양(W) - 기본 요금 양(R)) * 초과 요금(S)
 */
package D2;

import java.util.Scanner;

public class D2_1284_수도_요금_경재 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int W = sc.nextInt();

            int A = W * P;
            int B = 0;

            if (W > R)
                B = Q + (W - R) * S;
            else
                B = Q;
            int total = (A < B ? A : B);
            System.out.printf("#%d %d", test_case, total);
        }

    }
}
