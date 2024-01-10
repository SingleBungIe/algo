/*
알파벳 배열과 숫자 배열을 만들어 알파벳과 입력 갯 수를 저장한다.
숫자 배열의 인덱스에 담긴 값 만큼 반복하고 알파벳을 하나씩 꺼내어 출력하고
너비 카운터를 증가시킨다.
너비 카운터가 10이 되면 줄바꿈 하여 알파벳을 출력한다.
 */

package SWEA.D2;

import java.util.Scanner;

public class D2_1946_간단한_압축_풀기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            // 알파벳 저장
            char alphabet[] = new char[N];
            // 숫자 저장
            int num[] = new int[N];
            // 너비 카운터
            int cnt = 0;

            for (int i = 0; i < N; i++) {
                alphabet[i] = sc.next().charAt(0);
                num[i] = sc.nextInt();
            }

            System.out.printf("#%d", test_case);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < num[i]; j++) {
                    System.out.print(alphabet[i]);
                    cnt++;
                    if (cnt == 10) {
                        System.out.println();
                        cnt = 0; // 초기화 하고 다시 0부터 시작
                    }
                }
            }
            System.out.println();
        }
    }
}
