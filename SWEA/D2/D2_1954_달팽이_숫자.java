package SWEA.D2;

import java.util.Scanner;

public class D2_1954_달팽이_숫자 {
    static int dr[] = {0, 1, 0, -1};
    static int dc[] = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int num = 1;
            int map[][] = new int[N][N];
            int r = 0;
            int c = 0;
            int dir = 0;

            while (num <= (N * N)) {
                map[r][c] = num++;
                int nr = r + dr[dir];
                int nc = c + dc[dir];

                if (nr < 0 || nr >= N || nc < 0 || nc >= N || map[nr][nc] != 0) {
                    dir++;
                    if (dir == 4)
                        dir = 0;
                    nr = r + dr[dir];
                    nc = c + dc[dir];
                }

                r = nr;
                c = nc;

            }

            System.out.println("#" + test_case);

            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
}
