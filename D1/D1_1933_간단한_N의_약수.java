package D1;

import java.util.Scanner;

/*
나머지가 0임을 찾는 문제였다.
입력 값 / 2 이후의 값들은 반복 할 필요 없음 (센스)
 */

public class D1_1933_간단한_N의_약수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if ((N % i) == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
