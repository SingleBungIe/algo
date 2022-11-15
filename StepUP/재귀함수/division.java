package StepUP.재귀함수;

import java.util.Scanner;

public class division {
    static int n, CASE = 0;
    static int result[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        result = new int[n];

        getResult(0, 0);
        System.out.println(CASE);
    }

    private static void getResult(int sum, int index) {
        if (sum == n) { // 합이 5라면
            System.out.print(result[0]);
            for (int i = 1; i < index; i++) {
                System.out.print("+" + result[i]);
            }
            System.out.println();
            CASE++;
            return;
        } else {

            int num = n - sum;
            for (int i = num; i >= 1; i--) {
                if (i == n)
                    continue;

                result[index] = i;

                if (index - 1 >= 0 && result[index - 1] < result[index])
                    continue;


                getResult(sum + i, index + 1);
            }
        }

    }
}
