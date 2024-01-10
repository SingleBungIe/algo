/*
가속값과 감속값에 따라 거리값에 더해주고 빼준다.
거리값이 음수가 될 수 없으므로 0보다 작을 경우
거리값을 0으로 바꿔준다.
 */
package SWEA.D2;

import java.util.Scanner;

public class D2_1940_가랏_RC카 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int speed = 0;
            int dis = 0;
            for (int i = 0; i < N; i++) {
                int X = sc.nextInt();

                if (X == 1)
                    speed += sc.nextInt();
                else if (X == 2)
                    speed -= sc.nextInt();

                if (speed < 0)
                    speed = 0;

                dis += speed;
            }
            System.out.printf("#%d %d", test_case, dis);

        }
    }
}
