/*
반복문을 통해 카운트를 증가시켜 출력하게 접근하였으나
수학적인 접근을 통해 푼다면 더욱 간결한 코드가 완성된다.
 */
package SWEA.D1;

import java.util.Scanner;

public class D1_2043_서랍의_비밀번호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int K = sc.nextInt();
//        int cnt = 0;
//        for (int i = K; i <= P; i++) {
//            cnt++;
//        }
//        System.out.println(cnt);
        System.out.println(P-K+1);
    }
}
