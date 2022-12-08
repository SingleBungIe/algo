package StepUP.완전탐색_2;

import java.util.Scanner;

public class tetris_retry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int R = sc.nextInt();
        int tetris[][] = new int[R][C];
        int score = 0;
        int maxScore = 0;
        int resultX = 0;
        int resultY = 0;

        for (int i = 0; i < R; i++)
            for (int j = 0; j < C; j++)
                tetris[i][j] = sc.nextInt();

        for (int i = 0; i < R; i++) {
            loop1:
            for (int j = 0; j < C; j++) {
                if (tetris[i][j] == 0) {
                    for (int search = i; search >= 0; search--) {
                        if (tetris[search][j] == 1)
                            continue loop1;
                    }

                    loop2:
                    for (int k = 0; k < 4; k++) {
                        if ((i - 1 >= 0 && tetris[i - 1][j] == 1) || i + k == R || tetris[i + k][j] == 1) {
                            score = 0;
                            break;
                        } else if (j - 1 >= 0 && tetris[i + k][j - 1] == 1 && j + 1 < C && tetris[i + k][j + 1] == 1) {
                            for (int search = 0; search < C; search++)
                                if (tetris[i + k][search] == 0) {
                                    if (j == search)
                                        continue;
                                    continue loop2;
                                }

                            score++;
                        }
                        if (k == 3 && !(i + k + 1 == R || tetris[i + k + 1][j] == 1))
                            score = 0;
                    }
                    if (maxScore < score) {
                        maxScore = score;
                        resultX = j + 1;
                        resultY = maxScore;
                    }
                    score = 0;


                }
            }
        }
        System.out.println(resultX + " " + resultY);


    }
}


