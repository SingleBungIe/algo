package StepUP.완전탐색_2;

import java.util.Scanner;

public class tetris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int R = sc.nextInt();
        int tetris[][] = new int[R][C];
        int cnt = 0;
//        int X = 0;
        int Y = 0;
        int resultX = 0;
        int resultY = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                tetris[i][j] = sc.nextInt();
//                System.out.print(tetris[i][j] + " ");
            }
//            System.out.println();
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                cnt = 0;
                Y = 0;
                if (tetris[i][j] == 0) {
                    for (int k = 0; k < 4; k++) {
                        if (i + k < R && tetris[i + k][j] == 1)
                            break;
                        else if (i + k < R && tetris[i + k][j] == 0) {
                            cnt++;
                            if (j - 1 >= 0 && j + 1 < C && tetris[i + k][j - 1] == 1 && tetris[i + k][j + 1] == 1) {
                                Y++;
                            }
                            if (cnt == 4 && resultY <= Y && (i + 4 == R || tetris[i + 4][j] == 1)) {
                                resultY = Y;
                                resultX = j + 1;
                            }
                            continue;
                        }
                    }
                }
            }
        }
        if (resultX != 0)
        System.out.println(resultX + " " + resultY);
        else
            System.out.println("0" + " " + "0");


    }
}

/*

5개를 내렸을때 1이 이였어야함
if (tetris[i][j] == 1)
양 쪽이 1이라면 y++

 */
