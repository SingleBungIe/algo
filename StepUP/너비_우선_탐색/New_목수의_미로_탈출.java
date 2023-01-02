package StepUP.너비_우선_탐색;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class New_목수의_미로_탈출 {
    static int N, M;
    //    static int map[][];
    static int map[][];
    static boolean visited[][];
    static int dr[] = {-1, 1, 0, 0};
    static int dc[] = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N][M];
        int startPointBfsMap[][] = new int[N][M];
        int endPointBfsMap[][] = new int[N][M];
        int A[][] = new int[N][M];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                map[i][j] = sc.nextInt();

        int result = M * N;

        bfs(N - 1, 0, startPointBfsMap);
        bfs(0, M - 1, endPointBfsMap);
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++) {
                if (map[i][j] > 0 // map이 벽 이고 ( 사실상 벽이든 아니든 상관 없음 )
                        && startPointBfsMap[i][j] > 0 && endPointBfsMap[i][j] > 0 // start && end 둘 다 방문한 적이 있으면
                ) {
                    result = Math.min(result, startPointBfsMap[i][j] + endPointBfsMap[i][j] - 2);
                }
            }

        System.out.println(result);
    }

    private static void bfs(int A, int B, int distance[][]) {
        Queue<int[]> queue = new LinkedList<>();
        visited = new boolean[N][M];
        queue.offer(new int[]{A, B});
        distance[A][B] = 1;
        visited[A][B] = true;

        while (!queue.isEmpty()) {
            int current[] = queue.poll();

            for (int d = 0; d < 4; d++) {
                int nr = current[0] + dr[d];
                int nc = current[1] + dc[d];
                if (nr >= 0 && nc >= 0 && nr < N && nc < M && !visited[nr][nc]) {
                    distance[nr][nc] = distance[current[0]][current[1]] + 1;
                    visited[nr][nc] = true;
                    if (map[nr][nc] == 0) { // 벽이 아니면 큐에 넣고 벽이면 넣지 않음
                        queue.offer(new int[]{nr, nc});
                    }
                }
            }
        }
    }
}
