package StepUP.너비_우선_탐색;

import java.util.*;

public class New_깊이우선탐색과_너비우선탐색 {
    static int N;
    static boolean adjMatrix[][];
    static boolean visited[];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();
        adjMatrix = new boolean[N][N];
        visited = new boolean[N];

        // 인접행렬 세팅
        for (int i = 0; i < M; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            adjMatrix[from][to] = adjMatrix[to][from] = true;
        }

        DFS(0);
        visited = new boolean[N];
        System.out.println();
        BFS();

    }

    private static void DFS (int current) {
        visited[current] = true;
        System.out.print(current + " ");

        for (int i = 0; i < N; i++) {
            if(!visited[i] && adjMatrix[current][i]) {
                DFS(i);
            }
        }
    }

    private static void BFS () {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int i = 0; i < N; i++) {
                if (!visited[i] && adjMatrix[current][i]) {
                    queue.offer(i);
                    visited[i] = true;
                }

            }

        }

    }
}
