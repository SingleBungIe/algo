/*
Arrays.sort()를 활용해 정렬하면 쉽게 찾을 수 있는 문제였다.
 */
package D1;

import java.util.Arrays;
import java.util.Scanner;

public class D1_2063_중간값_찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer arr[] = new Integer[199];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[N/2]);
    }
}
