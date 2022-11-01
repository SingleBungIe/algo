package D2;

import java.util.Scanner;

public class two {


    static char[][] a;
    static boolean[][] visited;
    final static int dy[] = new int[]{1, -1, 0, 0};
    final static int dx[] = new int[]{0, 0, 1, -1};
    static int max = 0;
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = new char[4][4];
        visited = new boolean[4][4];

        for (int i = 0; i < 4; ++i) {
            a[i] = sc.next().toCharArray();
        }
        for (int i = 0; i < 4; ++i)
            for (int j = 0; j < 4; ++j) {

                if (visited[i][j] == false) {
                    boolean cand = dfs(i, j, -1, -1, a[i][j]);
                    if (cand) {
                        System.out.println("Yes");
                        System.exit(0);
                    }
                }
            }
        System.out.println("No");
    }

    static boolean dfs(int y, int x, int by, int bx, char alp) {

        if (visited[y][x]) return true;

//        visited[y][x] = true;

        for (int k = 0; k < 4; ++k) {
            int ny = y + dy[k];
            int nx = x + dx[k];
            if (!(0 <= ny && ny < 4 && 0 <= nx && nx < 4)) {
                cnt++;
                if (max < cnt)
                    max = cnt;
                dfs(ny, nx, y, x, alp);
            }
        }
        return false;
    }
}

//continue;
//        if (a[ny][nx] != alp) continue;
//        if (ny == by && nx == bx) continue;
//
//        if (dfs(ny, nx, y, x, alp))
//        return true;