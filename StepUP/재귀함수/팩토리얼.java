package StepUP.재귀함수;

import java.util.Scanner;

public class 팩토리얼 {
    static int N, R;
    static int numbers[];
    static int input[];
    static boolean isSelected[];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        N = Math.min(N, 7);
        R = sc.nextInt();
        if (!(R <= Math.min(N, 7)))
            return;
        numbers = new int[N];
        input = new int[R];
        isSelected = new boolean[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = i;
        }

        // 순열(중복미포함)
        permutation(0);
    }

    private static void permutation(int cnt) {
        // 기저조건
        if (R == cnt) {
            for (int i = 0; i < R; i++)
                System.out.print((char)(input[i] + 97));
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if(isSelected[i])
                continue;

            input[cnt] = numbers[i];
            isSelected[i] = true;

            permutation(cnt + 1);
            isSelected[i] = false;
        }
    }
}
