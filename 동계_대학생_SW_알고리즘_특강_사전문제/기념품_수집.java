package 동계_대학생_SW_알고리즘_특강_사전문제;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 기념품_수집 {
    static int R;
    static int C;
    static boolean visited[][];
    static boolean alphabet[];
    static int dr[] = {-1, 1, 0, 0};
    static int dc[] = {0, 0, -1, 1};
    static char map[][];
    static int num;
    static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            R = sc.nextInt();
            C = sc.nextInt();
            map = new char[R][C];
            visited = new boolean[R][C];
            num = 0;
            result = 1;
            for (int i = 0; i < R; i++) {
                String s = sc.next();
                for (int j = 0; j < C; j++) {
                    map[i][j] = s.charAt(j);
                }
            }

//            int alphabetCnt = 0;
//            for (int i = 0; i < R; i++) {
//                for (int j = 0; j < C; j++) {
////                    map[i][j] =
//                }
//            }
            alphabet = new boolean[26];
//            BFS();
            DFS(0, 0);
            System.out.println("#" + t + " " + result);
        }


    }

    private static void BFS() {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        alphabet[map[0][0] - 65] = true;
        visited[0][0] = true;
        num++;

        while (!queue.isEmpty()) {
            int curent[] = queue.poll();
            for (int d = 0; d < 4; d++) {
                int nr = dr[d] + curent[0];
                int nc = dc[d] + curent[1];
                if (nc >= 0 && nr >= 0 && nr < R && nc < C) {
                    if (!visited[nr][nc]) {
                        if (!alphabet[map[nr][nc] - 65]) {
                            alphabet[map[nr][nc] - 65] = true;
                            queue.offer(new int[]{nr, nc});
                            visited[nr][nc] = true;
                            num++;
                        }
                    }
                }
            }
        }
    }

    private static void DFS(int row, int col) {
        visited[row][col] = true;
        alphabet[map[0][0] - 65] = true;
        num++;
        result = Math.max(result, num);

        for (int d = 0; d < 4; d++) {
            int nr = dr[d] + row;
            int nc = dc[d] + col;
            if (nc >= 0 && nr >= 0 && nr < R && nc < C) {
                if (!visited[nr][nc] && !alphabet[map[nr][nc] - 65]) {
                    alphabet[map[nr][nc] - 65] = true;
                    visited[nr][nc] = true;
                    DFS(nr, nc);
                    alphabet[map[nr][nc] - 65] = false;
                    visited[nr][nc] = false;

                    num--;
                }
            }
        }
    }
}




