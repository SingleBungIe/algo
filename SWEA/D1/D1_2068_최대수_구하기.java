/*
Arrays.sort(arr, Collections.reverseOrder())를 활용하여 역순 크기로 정렬해
첫 번째 인자 값만 출력하도록 접근 하였다.
 */
package SWEA.D1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class D1_2068_최대수_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            Integer arr[] = new Integer[10];

            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr, Collections.reverseOrder());
            System.out.println("#" + test_case + " " + arr[0]);
        }
    }
}
