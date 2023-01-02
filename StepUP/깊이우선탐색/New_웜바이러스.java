package StepUP.깊이우선탐색;

import java.util.Scanner;

public class New_웜바이러스 {
    static boolean adjMatrix[][];
    static int N;
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 컴퓨터 수
        int E = sc.nextInt(); // 간선 수
        boolean visited[] = new boolean[N + 1];
        adjMatrix = new boolean[N + 1][N + 1];
        for (int i = 1; i <= E; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            adjMatrix[from][to] = adjMatrix[to][from] = true;
        }
        dfs(1, visited);
        System.out.println(cnt - 1);

    }

    private static void dfs(int current, boolean visited[]) {
        visited[current] = true;
        cnt++;

        for (int i = 1; i <= N; i++) {
            if (!visited[i] && adjMatrix[current][i]) {
                dfs(i, visited);
            }
        }
    }
}
