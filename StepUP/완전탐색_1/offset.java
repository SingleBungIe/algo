package StepUP.완전탐색_1;

import java.util.Scanner;

public class offset {
    static int dr[] = {1, -1, 0, 0}; // 상하 탐색
    static int dc[] = {0, 0, -1, 1}; // 좌우 탐색

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[5][5];
        int nr = 0;
        int nc = 0;
        int directionNum = 0; // 배열 위치에 따라 탐색 해야 하는 수
        int directionCnt = 0; // 탐색 할 때마다 증가하는 카운터 수
        for (int i = 0; i < 5; i++) { // 초기값 세팅
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                directionCnt = 0;
                if ((i == 0 && j == 0) || (i == 0 && j == 4) || (i == 4 && j == 0) || (i == 4 && j == 4)) { // 꼭지점 일 때
                    directionNum = 2;
                } else if ((i == 0) || (j == 4) || (j == 0) || (i == 4)) { // 행렬의 끝 라인들일 경우
                    directionNum = 3;
                } else
                    directionNum = 4;

                for (int d = 0; d < 4; d++) { // 4방 탐색
                    nr = i + dr[d];
                    nc = j + dc[d];
                    if (nr >= 0 && nc >= 0 && nr < 5 && nc < 5) {
                        if (arr[i][j] < arr[nr][nc]) {
                            directionCnt++;
                            if (directionNum == directionCnt) {
                                arr[i][j] = -1;
                                break;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 5; i++) { // 출력
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == -1)
                    System.out.print("*" + " ");
                else
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
