/*
10개의 논리 배열을 만들고
입력 숫자를 증가시키며 자릿수를 탐색한다.
자릿수의 값(0~9)이 논리배열에서
false 면 true로 바꿔주고
카운터를 증가시켜 체크한다.
 */
package D2;

import java.util.Scanner;

public class D2_1288_새로운_불면증_치료법 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            String A = sc.next();
            int N = Integer.parseInt(A);
            boolean[] arr = new boolean[10];
            int num = 1;
            int cnt = 0;

            while (true) {
                for (int i = 0; i < A.length(); i++) {
                    int temp = Integer.parseInt(A.substring(i, i + 1));
                    if (arr[temp] == false) {
                        arr[temp] = true;
                        cnt++;
                    }
                }
                if (cnt == 10) break;
                else {
                    num++;
                    A = Integer.toString(num * N);
                }
            }
            System.out.printf("#%d %s\n", test_case, A);
        }
    }
}
