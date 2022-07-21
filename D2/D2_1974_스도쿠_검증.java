package D2;

import java.util.Scanner;

public class D2_1974_스도쿠_검증 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int[][] map = new int[9][9];
            boolean sign = true;

            // 배열입력
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            // 행체크
            for (int i = 0; i < 9; i++) {
                int arr[] = new int[9];
                for (int j = 0; j < 9; j++) {
                    arr[(map[i][j]) - 1]++;
                }
                for (int a = 0; a < 9; a++) {
                    if (arr[a] == 0) {
                        sign = false;
                        break;
                    }
                }
            }

            // 열체크
            for (int i = 0; i < 9; i++) {
                int arr[] = new int[9];
                for (int j = 0; j < 9; j++) {
                    arr[(map[j][i]) - 1]++;
                }
                for (int a = 0; a < 9; a++) {
                    if (arr[a] == 0) {
                        sign = false;
                        break;
                    }
                }
            }

            // 격자체크
            for (int i = 0; i <= 6; i += 3) {
                for (int j = 0; j <= 6; j += 3) {
                    int arr[] = new int[9];
                    int r = i + 3;
                    int c = j + 3;

                    for (int a = i; a < r; a++) {
                        for (int b = j; b < c; b++)
                            arr[(map[a][b] - 1)]++;
                    }
                    for (int z = 0; z < 9; z++) {
                        if (arr[z] == 0) {
                            sign = false;
                            break;
                        }
                    }
                }
            }

            if (sign == true)
                System.out.printf("#%d %d\n", test_case, 1);
            else
                System.out.printf("#%d %d\n", test_case, 0);
        }
    }
}
