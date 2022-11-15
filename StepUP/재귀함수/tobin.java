package StepUP.재귀함수;

import java.util.Scanner;

public class tobin {
    static int n, k;
    static int cnt = 0;
    static int result[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        result = new int[n];

        getResult(0);

    }

    private static void getResult(int index) {
        // 기저조건
        if (n == index) {
            if (cnt == k) {
                for (int i = 0; i < n; i++)
                    System.out.print(result[i]);
                System.out.println();
            }
            return;
        } else {
            if (cnt < k) {
                result[index] = 1;
                cnt++;
                getResult(index + 1);
                cnt--;
            }
            result[index] = 0;
            getResult(index + 1);
        }
    }
}
