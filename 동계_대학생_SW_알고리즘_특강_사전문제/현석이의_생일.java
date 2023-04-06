package 동계_대학생_SW_알고리즘_특강_사전문제;

import java.util.Scanner;

public class 현석이의_생일 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            String N = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.print("#" + test_case + " ");
            if (x == 0 && N.charAt(0) - 48 < y) {
                System.out.println(-1);
                continue;
            }

            /*
            5000   0   8
            16  1   3
            2   6   9
            422223324   2   4

            50 0 5
             */
            // 뒷자리를 확인
            /*
            y > x
            N의 자릿수들을 비교, N의 자릿수가 <= y
            N = 8 , y = 7, x 는 무조건 7보다 작아


             */
            for (int i = 0; i < N.length(); i++) {

                if (N.charAt(i) - 48 > y) { // x < y 이기 때문에 y 부터 판별, y가 N의 i번째 인덱스 보다 크다면
                    System.out.print(y); // y 출력
                } else if (N.charAt(i) - 48 == y) {
                    if (N.charAt(i + 1) - 48 >= y) { // 422223324 2 4
                        for (int j = i; j < N.length() - i; j++) {
                            System.out.print(y);
                        }
                        break;
                    } else {
                        System.out.print(y);
                    }
                } else if (x >= 0 && N.charAt(i) - 48 > x) { // x는 출력 가 N의 i번째 인덱스
                    System.out.print(x);
                    for (int j = i; j < N.length() - 1; j++) {
                        System.out.print(y);
                    }
                    break;
                } else if ((x >= 0 && N.charAt(i) - 48 >= x)) { // N > x 상황에서 x를 사용하면 다음은 전부 y
                    System.out.print(x);
                } else if (N.charAt(i) - 48 < x && N.charAt(i) - 48 < y) {
                    System.out.print(-1);
                    break;
                } else {
                    System.out.print(-1);
                    break;
                }
            }
            System.out.println();
        }

    }
}
