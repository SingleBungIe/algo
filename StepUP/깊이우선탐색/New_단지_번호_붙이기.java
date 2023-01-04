package StepUP.깊이우선탐색;

import java.util.*;


public class New_단지_번호_붙이기 {
    static int rocationHouse = 1; // 단지 집 수
    static int rocation = 0; // 단지 집 수
    static int dr[] = {-1, 1, 0, 0};
    static int dc[] = {0, 0, -1, 1};
    static int N;
    static int map[][];
    static boolean visited[][];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        visited = new boolean[N][N];
        ArrayList<Integer> result = new ArrayList<>();

        // map 세팅
        for (int i = 0; i < N; i++) {
            String input = sc.next();
            for (int j = 0; j < N; j++){
                map[i][j] = input.charAt(j) - '0';
            }
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    DFS(i, j);
                    result.add(rocationHouse);
                    rocation++;
                    rocationHouse = 1;
                }
            }
        }
        System.out.println(rocation);
        Collections.sort(result);
        for (int i : result)
            System.out.println(i);

    }

    private static void DFS(int row, int colum) {
        visited[row][colum] = true;

        for (int d = 0; d < 4; d++) {
            int nr = dr[d] + row;
            int nc = dc[d] + colum;
            if (nr >= 0 && nc >= 0 && nr < N && nc < N) {
                if (!visited[nr][nc] && map[nr][nc] == 1) {
                    DFS(nr, nc);
                    rocationHouse++;
                }
            }
        }
    }
}
