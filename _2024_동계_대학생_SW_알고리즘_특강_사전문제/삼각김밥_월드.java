package _2024_동계_대학생_SW_알고리즘_특강_사전문제;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 삼각김밥_월드 {
    static int map[][];
    static boolean visited[][];
    static int dr[] = {-1, -1, 0, 1, 1, 0};
    static int dc[] = {-1, 0, 1, 1, 0, -1};
    static int s_row = 0;
    static int s_col = 0;
    static int e = 0;
    static int e_row = 0;
    static int e_col = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int t = 1; t <= testCase; t++) {
            int s = sc.nextInt(); // 출발지점
            e = sc.nextInt(); // 도착지점
            if (s == e) {
                System.out.println("#" + t + " " + 0);
                continue;
            }
            map = new int[141][141];
            visited = new boolean[141][141]; // s >= 1, e <= 10,000


            // 직각삼각형 모양으로 바꾼 삼각김밥월드
            int num = 1;
            for (int i = 0; i <= 140; i++) {
                for (int j = 0; j <= i; j++) {
                    map[i][j] = num;

                    if (num == s) {
                        s_row = i;
                        s_col = j;
                    }

                    if (num == e) {
                        e_row = i;
                        e_col = j;
                    }

                    num++;
                }
            }
            BFS(t);
//            System.out.println();
        }

    }

    private static void BFS(int t) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{s_row, s_col, 0});
        visited[s_row][s_col] = true;

        while (!queue.isEmpty()) {
            int current[] = queue.poll();
            for (int d = 0; d < 6; d++) {
                int nr = dr[d] + current[0];
                int nc = dc[d] + current[1];
                if (nc >= 0 && nr >= 0 && nr < 141 && nc < 141 && map[nr][nc] != 0) {
                    if (!visited[nr][nc]) {
                        if (map[nr][nc] == e) {
                            System.out.println("#" + t + " " + (current[2] + 1));
                            return;
                        }
                        queue.offer(new int[]{nr, nc, current[2] + 1});
                        visited[nr][nc] = true;

                    }

                }
            }
        }

    }

}

/*


1. 삼각김밥을 2차원 배열로 나열
2. 행이 증가 할 때, 저장된 값 인덱스 i씩 증가
3. 열의 개수는 행의 인덱스 +1개
4. 최단거리 탐색으로 BFS 활용
5. 3행 1열 인덱스 값 '8'를 기준으로 8방 탐색 진행
6. 단, 인덱스를 1행 1열 증가시킨 값 '6', 인덱스를 1행 1열 감소시킨 값 '11' 방문 안함 (삼각김밥 월드로 만들면 열이 밀리기 때문에 방문 안함)

      0,0 0,1 0,2 0,3 0,4
0,0    1
1,0    2   3
2,0    4   5   6
3,0    7   8   9   10
4,0    11  12  13  14  15

 */