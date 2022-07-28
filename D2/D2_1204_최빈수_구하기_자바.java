/*
1~100까지 담을 수 있는 점수 배열을 만들어
인원 수 만큼 반복문을 돌리고
각 인원의 점수를 점수 배열에서 카운트한다.
마지막으로 점수 배열의 최댓값을 비교하며 탐색해
최빈값을 저장한다.
 */
package D2;

import java.util.Scanner;

public class D2_1204_최빈수_구하기_자바 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int[] arr = new int[101];
            int max = 0;
            int result = 0;
            int num = sc.nextInt();

            for (int i = 0; i < 1000; i++) {
                int score = sc.nextInt();
                arr[score]++;
            }

            for (int i = 0; i < 101; i++) {
                if (max <= arr[i]) {
                    max = arr[i];
                    result = i;
                }
            }
            System.out.printf("#%d %d\n", test_case, result);
        }


    }
}
