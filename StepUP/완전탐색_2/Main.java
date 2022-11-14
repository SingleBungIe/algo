package StepUP.완전탐색_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int studentTable[][] = new int[N + 1][6];
        int cnt = 0;
        int result = 0;
        int reader = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= 5; j++) {
                studentTable[i][j] = sc.nextInt();
                System.out.print(studentTable[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 1; i <= N; i++) {
            cnt = 0;
            Loop1:
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (studentTable[i][k] == studentTable[j][k] && i != j) {
                        cnt++;
                        if (cnt > result) {
                            result = cnt;
                            reader = i;
                        }
                        continue Loop1;
                    }
                }
            }
        }
        if (reader == 0)
            System.out.println(1);
        else
            System.out.println(reader);

    }
}
