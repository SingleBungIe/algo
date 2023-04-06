package StepUP;

import java.util.Scanner;

public class 형석이생일 {
    static int N, R, CASE = 0;
    static int numbers[];
    static int input[];
    public static void main(String[] args) {int answer = 0;
        N = 3;
        R = 2;
        numbers = new int[N];
        input = new int[R];
        for (int i = 0; i < N; i++) {
            numbers[i] = i + 1;
        }
        combination(0);
        System.out.println(CASE);
    }
    private static void combination(int cnt) {
        if (R == cnt) {
            CASE++;
            return;
        }

        for (int i = 0; i < N; i++) {
            input[cnt] = numbers[i];

            combination(cnt + 1);
        }
    }
}
