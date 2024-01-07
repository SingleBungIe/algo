package _2024_동계_대학생_SW_알고리즘_특강_사전문제;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class pjy_삼각김밥_월드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int world[][] = new int[141][141];
        boolean check[][] = new boolean[141][141];

        int dr[] = {0, 0, -1, -1, 1, 1};
        int dc[] = {1, -1, -1, 0, 1, 0};

        for (int testCase = 1; testCase <= T; testCase++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int sR = 0;
            int sC = 0;

            if (start == end) {
                System.out.println("#" + testCase + " " + 0);
                continue;
            }

            int cnt = 1;
            for (int i = 0; i <= 140; i++) {
                for (int j = 0; j <= i; j++) {
                    if (cnt == start) {
                        sR = i;
                        sC = j;
                    }

                    world[i][j] = cnt;
                    cnt++;
                }
            }

            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{sR, sC, 0});
            check[sR][sC] = true;

            Loop : while (!queue.isEmpty()) {
                int current[] = queue.poll();
                for (int d = 0; d < 6; d++) {
                    int nr = dr[d] + current[0];
                    int nc = dc[d] + current[1];
                    if (nc >= 0 && nr >= 0 && nr < 141 && nc < 141 && world[nr][nc] != 0) {
                        if (!check[nr][nc]) {
                            if (world[nr][nc] == end) {
                                System.out.println("#" + testCase + " " + (current[2] + 1));
                                break Loop;
                            }
                            queue.offer(new int[]{nr, nc, current[2] + 1});
                            check[nr][nc] = true;
                        }
                    }
                }
            }
        }
    }
}


