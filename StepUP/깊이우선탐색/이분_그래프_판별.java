package StepUP.깊이우선탐색;
import java.util.Scanner;

public class 이분_그래프_판별 {
    static int n;
    static boolean map[][];
    static int visited[];
    static boolean result = true;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        map = new boolean[n+1][n+1];
        visited = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a][b] = true;
            map[b][a] = true;
        }

        dfs(1, false);
        if(result)
            System.out.print("Yes");
        else
            System.out.print("No");


    }

    static void dfs(int v, boolean color) {
        // color : false=1, true = 2
        if (visited[v] > 0)
            return;
        if (color)
            visited[v] = 2;
        else
            visited[v] = 1;

        for (int i = 1; i <= n; i++) {
            if (map[v][i]) {
                if (visited[i] == visited[v]) {
                    result = false;
                    return;
                } else if (visited[i] == 0) {
                    dfs(i, !color);
                }
            }
        }
    }
}
