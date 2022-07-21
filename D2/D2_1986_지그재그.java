/*
0부터 시작 해서 for문의 증가하는 인자 값을 활용하여
짝수와 홀수를 판단하고 덧셈과 뺄셈을 조건식에 맞춰 실행 시켜주는 간단한 문제였다.
 */
package D2;

import java.util.Scanner;

public class D2_1986_지그재그 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 1)
                    sum += i;
                else if (i % 2 == 0)
                    sum -= i;
            }
            System.out.printf("#%d %d\n", test_case, sum);

        }
    }
}
