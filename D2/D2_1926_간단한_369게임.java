/*
십의 자리와 일의 자리를 분리 시키면 쉽게 풀 수 있었던 문제
continue를 쓰지 않아서 삽질 했던 문제
 */

package D2;

import java.util.Scanner;

public class D2_1926_간단한_369게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int a = i / 10; // 십의 자리 판단
            int b = i % 10; // 일의 자리 판단

            if (a == 3 || a == 6 || a == 9) {
                if (b == 3 || b == 6 || b == 9) {
                    System.out.print("-- ");
                    continue;
                }
                System.out.print("- ");
            } else if (b == 3 || b == 6 || b == 9)
                System.out.print("- ");
            else
                System.out.print(i + " ");
        }
    }
}
