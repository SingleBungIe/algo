package StepUP.너비_우선_탐색;


import java.io.*;
import java.util.*;

public class 목수의_미로_탈출 {

   private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static int n;
    private static int m;

    private static int[][] arr;
    private static int[][] dist;
    private static boolean[][] isNotBroken;
    private static boolean[][] isBroken;

    private static int[] dy = {-1, 1, 0, 0};
    private static int[] dx = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        dist = new int[n][m];
        isNotBroken = new boolean[n][m];
        isBroken = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs(n - 1, 0);

        bw.write(dist[0][m - 1] + "");
        br.close();
        bw.flush();
        bw.close();
    }

    private static void bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j, 0}); // 0은 한번도 부수지 않은 상태, 1은 한번 부순 상태
        isNotBroken[i][j] = true;

        while (!queue.isEmpty()) {
            if (dist[0][m - 1] != 0) break; // e가 벽이면 탐색 불가
            int[] w = queue.poll();

            for (int k = 0; k < 4; k++) {
                int y = w[0] + dy[k];
                int x = w[1] + dx[k];
                int b = w[2];

                if (y >= 0 && y < n && x >= 0 && x < m) {
                    if (b == 1) { // 벽을 이미 한번 부순 상태
                        if (!isNotBroken[y][x] && !isBroken[y][x] && arr[y][x] == 0) { // 다른 노드가 방문 하지 않았고 && 방문 미로가 벽이 아니면
                            queue.add(new int[]{y, x, 1});
                            dist[y][x] = dist[w[0]][w[1]] + 1;
                            isBroken[y][x] = true;
                        }
                    } else { // 한번도 벽을 부수지 않은 상태
                        if (!isNotBroken[y][x]) {
                            if (arr[y][x] == 0) queue.add(new int[]{y, x, 0});
                            else if (arr[y][x] == 1) queue.add(new int[]{y, x, 1});
                            dist[y][x] = dist[w[0]][w[1]] + 1;
                            isNotBroken[y][x] = true;
                        }
                    }
                }
            }
        }
    }
}