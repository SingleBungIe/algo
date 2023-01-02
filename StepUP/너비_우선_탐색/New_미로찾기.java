package StepUP.너비_우선_탐색;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class New_미로찾기 {
    static int N, M;
    static int adjMatrix[][];
    static boolean visited[][];
    static int dr[] = {-1, 1, 0, 0};
    static int dc[] = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        adjMatrix = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                adjMatrix[i][j] = sc.nextInt();
        bfs();
        System.out.println(adjMatrix[0][M-1]);
    }

    private static void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{N - 1, 0});
        visited[N - 1][0] = true;

        while (!queue.isEmpty()) {
            int current[] = queue.poll();

            for (int d = 0; d < 4; d++) {
                int nr = current[0] + dr[d];
                int nc = current[1] + dc[d];
                if (nr >= 0 && nc >= 0 && nr < N && nc < M) {
                    if (!visited[nr][nc] && adjMatrix[nr][nc] == 0) {
                        adjMatrix[nr][nc] = adjMatrix[current[0]][current[1]] + 1;
                        queue.offer(new int[]{nr, nc});
                    }
                }
            }
        }
    }
}
