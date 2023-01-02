package StepUP.너비_우선_탐색;

import java.io.*;
import java.util.*;

public class 미로찾기 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static int n;
    private static int m;

    private static int[][] arr;
    private static boolean[][] isVisited;

    private static int[] dy = {-1, 1, 0, 0};
    private static int[] dx = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        isVisited = new boolean[n][m];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs(n-1, 0);

        bw.write(arr[0][m-1] + "");
        br.close();
        bw.flush();
        bw.close();
    }

    private static void bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {i, j});
        isVisited[i][j] = true;

        while(!queue.isEmpty()) {
            int[] w = queue.poll();

            for(int k = 0; k < 4; k++) {
                int y = w[0] + dy[k];
                int x = w[1] + dx[k];

                if(y >= 0 && y < n && x >=0 && x < m) {
                    if(arr[y][x] == 0 && !isVisited[y][x]) {
                        queue.add(new int[] {y, x});
                        isVisited[y][x] = true;
                        arr[y][x] = arr[w[0]][w[1]] + 1;
                    }
                }
            }
        }
    }
}