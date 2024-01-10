/*
문제가 왼쪽이랑 오른쪽 위의 합인 줄 알았는데
왼쪽 위와 오른쪽 위의 합 이였다...
(0,0)
(1,0)(1,1)
(2,0)(2,1)(2,2)
(3,0)(3,1)(3,2)(3,3)
 */
package SWEA.D2;

import java.util.Scanner;

public class D2_2005_파스칼의_삼각형 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            System.out.println("#"+test_case);
            int pascal[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= i; j++) {
                    if (i == j || j == 0)
                        pascal[i][j] = 1;
                    else
                        pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                    System.out.print(pascal[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
}
