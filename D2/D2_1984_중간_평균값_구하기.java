/*
Arrays.sort로 정렬 후 처음과 마지막 배열의 값을 0으로 바꾸고
Math.round()메소드를 사용하여 반올림 하였다.
주의할 점을 double로 형변환 시켜 값이 사라지는 것을 주의하여 사용해야 한다.
리스트를 활용하면 (List.remove)조금 더 클린하고 메모리가 효율적일 듯 하다.
 */
package D2;

import java.util.Arrays;
import java.util.Scanner;

public class D2_1984_중간_평균값_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            Integer arr[] = new Integer[10];
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            arr[0] = 0;
            arr[9] = 0;
            for (int i = 0; i < 10; i++) {
                sum += arr[i];
            }
            System.out.printf("#%d %d\n",test_case, Math.round((double) sum/8));

        }
    }
}
