package StepUP.다중반복문_배열;

import java.util.Scanner;

public class 소수_판별_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int divisor;
        for (int i = n; i <= m; i++) {
            divisor = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisor++;
                }
            }
            if (divisor == 2) // 소수는 약수가 1과 자기자신 2개
                System.out.print(i + " ");
        }
    }
}
