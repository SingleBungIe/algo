package StepUP.완전탐색_2;

import java.util.Scanner;

public class seat {
    // 4방 탐색 일반화
    static int dr[] = {0, 1, 0, -1};
    static int dc[] = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int seatNum = sc.nextInt();
        int seat[][] = new int[R][C];
        int r = 0;
        int c = 0;
        int nr = 0;
        int nc = 0;
        int cnt = 1;
        int dir = 0;

        seat[0][0] = cnt++;
        while (cnt - 1 != R * C) {
            nr = r + dr[dir];
            nc = c + dc[dir];


            if (nr < 0 || nr == R || nc < 0 || nc == C || seat[nr][nc] != 0) {
                dir++;
                if (dir == 4)
                    dir = 0;
                nr = r + dr[dir];
                nc = c + dc[dir];

            }

            seat[nr][nc] = cnt++;
            if (cnt - 1 == seatNum) {
                System.out.println((nr + 1) + " " + (nc + 1));
                return;
            }
            r = nr;
            c = nc;

        }
        if (R * C < seatNum)
            System.out.println("0");
    }

}

