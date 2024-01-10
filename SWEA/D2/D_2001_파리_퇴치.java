/*
파리채를 옮겨 가며
범위 안에 있는 파리수를 더하고
최댓값을 출력하는 문제였다.
정적변수와 함수를 활용하여 가독성을 높이고자 하였다.(주관적인 생각..?)
배열 옮겨가며 탐색하는 것을 오래만에 풀어봐 많이 헤매고 헷갈렸다.
 */
package SWEA.D2;

import java.util.Scanner;

public class D_2001_파리_퇴치 {
    static int N;
    static int M;
    static int map[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수
        for (int test_case = 1; test_case <= T; test_case++) { // 테스트 케이스 만큼 반복
            N = sc.nextInt(); // 배열 크기
            M = sc.nextInt(); // 파리채 크기
            int max = 0; // 파리채로 잡은 파리의 최대 수
            // 배열에 파리 투입!
            map = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            // 파리채로 때려잡기
            for (int i = 0; i <= N - M; i++) { // 배열크기-파리채크기를 통해 배열 범위를 넘지 않게 탐색
                for (int j = 0; j <= N - M; j++)
                    max = Math.max(max, getMax(i, j));
            }
            System.out.printf("#%d %d\n", test_case, max);
        }
    }

    // 최대 파리수 계산하는 함수
    static int getMax(int x, int y) {
        int res = 0;
        for (int i = x; i < x + M; i++) {
            for (int j = y; j < y + M; j++) {
                res += map[i][j];
            }
        }
        return res;
    }
}
