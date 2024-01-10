/*
두 배열의 크기를 비교하고
큰 배열의 인덱스를 하나씩 증가시켜 마주보는 인덱스를 바꿔주었다.
 */

package SWEA.D2;

import java.util.Scanner;

public class D2_1959_두_개의_숫자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int A[] = new int[N];
            int B[] = new int[M];

            for (int i = 0; i < A.length; i++) A[i] = sc.nextInt();
            for (int i = 0; i < B.length; i++) B[i] = sc.nextInt();

            int Max = 0;

            if (N < M) {
                for (int i = 0; i < M - N + 1; i++) {
                    int result = 0;
                    for (int j = 0; j < N; j++)
                        result += A[j] * B[i + j];
                    Max = Math.max(Max, result);
                }
            }
            if (N > M) {
                for (int i = 0; i < N - M + 1; i++) {
                    int result = 0;
                    for (int j = 0; j < M; j++)
                        result += A[i+j] * B[j];
                    Max = Math.max(Max, result);
                }
            }

            else {
                int result = 0;
                for (int a = 0; a < N; a++)
                    result += A[a] * B[a];
                Max = Math.max(Max, result);
            }
            System.out.printf("#%d %d\n", test_case, Max);
        }
    }
}
