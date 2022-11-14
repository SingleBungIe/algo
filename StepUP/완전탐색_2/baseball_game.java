package StepUP.완전탐색_2;

import java.util.Scanner;

public class baseball_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[][] = new int[103][3];
        int strike = 0;
        int ball = 0;
        int result = 0;

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt(); // 스트라이크
            arr[i][2] = sc.nextInt(); // 볼
        }

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    if (i != j && j != k && i != k) {
                        boolean flag = false;
                        for (int p = 0; p < N; p++) {
                            strike = 0;
                            ball = 0;
                            int first = arr[p][0] / 100;
                            int second = (arr[p][0] / 10) % 10;
                            int third = arr[p][0] % 10;

                            if (first == i) strike++;
                            if (second == j) strike++;
                            if (third == k) strike++;

                            if (i == second || i == third) ball++;
                            if (j == first || j == third) ball++;
                            if (k == first || k == second) ball++;

                            if (arr[p][1] != strike || arr[p][2] != ball) flag = true;

                        }
                        if (!flag) {
                            result++;
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}

