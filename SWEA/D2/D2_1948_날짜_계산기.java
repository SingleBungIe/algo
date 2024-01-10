/*
월 배열을 만들어 각 월의 값을 저장한다.
입력 값의 월을 인덱스로 사용하여
월 배열에서 날짜 값을 받아 합에 더해 준다.
그리고 나머지 입력 일을 합에 더해 준다.
같은 방법으로 두번째 입력 되는 월과 일을 반복해준다.
마지막으로 두 개의 합을 빼주고
첫 날도 일자에 포함 하기 때문에 +1을 더해준다.
 */
package SWEA.D2;

import java.util.Scanner;

public class D2_1948_날짜_계산기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        // 월 배열
        int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int test_case = 1; test_case <= T; test_case++) {
            int a = sc.nextInt() - 1; // 배열 인덱스 접근을 위해 -1
            int b = sc.nextInt();
            int c = sc.nextInt() - 1;
            int d = sc.nextInt();

            int sum = 0; // 첫 번째 날짜
            int sum2 = 0; // 두 번째 날짜

            for (int i = 0; i < a; i++)
                sum += month[i];
            sum += b;
            for (int i = 0; i < c; i++)
                sum2 += month[i];
            sum2 += d;

            System.out.printf("#%d %d\n", test_case, sum2 - sum + 1);
        }
    }
}
