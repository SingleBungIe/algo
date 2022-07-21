/*
가로로 찾고 세로로 탐색하면 쉽게 풀 수 있는 문제였음
탁색 배열 인덱스의 제약사항을 정의 하면 조금 더 코드가 깔끔 해질 듯 싶다.
 */
package D2;

import java.util.Scanner;

public class D2_1979_어디에_단어가_들어갈_수_있을까 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[][] map = new int[N][N];
            int words = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            // 가로 찾기
            for (int i = 0; i < N; i++) {
                int cnt = 0;
                for (int j = 0; j < N; j++) {
                    if (map[i][j] == 0) {
                        if (cnt == K) // cnt를 증가시키다가 다시 0이 될 때
                            words++; // 찾은 자리 +1
                        cnt = 0;
                    } else
                        cnt++;
                }
                if (cnt == K)
                    words++;
            }

            // 세로 찾기
            for (int j = 0; j < N; j++) {
                int cnt = 0;
                for (int i = 0; i < N; i++) {
                    if (map[i][j] == 0) {
                        if (cnt == K)
                            words++;
                        cnt = 0;
                    } else
                        cnt++;
                }
                if (cnt == K)
                    words++;
            }
            System.out.println("#" + test_case + " " + words);
        }
    }

}
