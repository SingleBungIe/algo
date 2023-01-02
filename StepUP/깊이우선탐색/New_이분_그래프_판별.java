package StepUP.깊이우선탐색;

import java.util.Scanner;

public class New_이분_그래프_판별 {
    static int N; // 정점 개수
    static int M; // 간선 개수
    static boolean adjMatrix[][];
    static char visited[];
    static String result = "YES";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        adjMatrix = new boolean[N + 1][N + 1];
        visited = new char[N + 1];
        for (int i = 1; i < M; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            adjMatrix[from][to] = adjMatrix[to][from] = true;
        }
        dfs(1, true);
        System.out.println(result);
    }

    private static void dfs(int currenrt, boolean AorB) {
        if (AorB)
            visited[currenrt] = 'A';
        else
            visited[currenrt] = 'B';
//        System.out.println();

        for (int i = 1; i <= N; i++) {
            if (adjMatrix[currenrt][i])
                if (visited[i] == visited[currenrt]) {
                    result = "NO";
                    return;
                } else
//                (visited[i] == 0 && adjMatrix[currenrt][i])
                // !AorB를 넘겨서 두 집합을 바꿔가며
                    dfs(i, !AorB);
        }
    }
}
