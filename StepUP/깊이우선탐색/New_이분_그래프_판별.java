package StepUP.깊이우선탐색;

import java.util.Scanner;

public class New_이분_그래프_판별 {

    static int group[];
    static int N;
    static String result = "Yes";
    static boolean adjMatrix[][];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();
        adjMatrix = new boolean[N + 1][N + 1];
        group = new int[N + 1];
        for (int i = 0; i < M; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            adjMatrix[from][to] = adjMatrix[to][from] = true;
        }
        DFS(1, true);
        System.out.println(result);

    }

    private static void DFS(int current, boolean AorB) {
        if (AorB)
            group[current] = 1; //groupA
        else
            group[current] = 2; //groupB

        for (int i = 1; i <= N; i++) {
            if (adjMatrix[current][i]) {
                if (group[i] == 0)
                    DFS(i, !AorB);
                else if (group[i] == group[current]) {
                    result = "No";
                    return;
                }
            }
        }
    }
}
