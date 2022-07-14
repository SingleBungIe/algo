/*
수학적인 센스가 부족해 생각보다 많은 고민을 했던 문제
 */

package D1;

import java.util.Scanner;

public class D1_2058_자릿수_더하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        while (N > 0) {
            sum += N % 10;
            N /= 10;
        }
        System.out.println(sum);
    }
}