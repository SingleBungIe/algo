/*
printf 출력 함수를 활용하여
코드를 간소화 하였다.
 */

package SWEA.D1;

import java.util.Scanner;

public class D1_2029_몫과_나머지_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("#%d %d %d\n", i, a / b, a % b);
        }
    }
}
