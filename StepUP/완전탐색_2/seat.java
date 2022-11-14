package StepUP.완전탐색_2;

import java.util.Scanner;

public class seat {
    static int dy[] = {1, 0, -1, 0};
    static int dx[] = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int seat[][] = new int[C + 1][R + 1];
        int people = 1;
        int x = 0;
        int y = 0;

        while (true) {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (0 < nx || R < R) {

                }

            }
        }

    }
}
