package StepUP;

/*
 반복문을 활용해 1부터 N까지 약수가 있을 때마다 카운터를 증가시키고
 찾고자 하는 약수의 순서와 카운터가 일치 할 경우 반복문의 인자 값을 출력한다.
 */

import java.util.Scanner;

public class 약수_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 구하는 약수
        int K = sc.nextInt(); // 약수의 순서
        int cnt = 0; // 약수의 개수를 나타내는 카운터

        for (int i = 1; N >= i; i++) {
            if (N % i == 0) { // 약수 판별
                cnt++; // 약수 카운터 증가
                if (cnt == K) { // 약수의 개수와 찾고자 하는 약수 순서 비교
                    System.out.println(i); // 반복문 인자값 출력
                    break;
                }
            }
        }

        if (cnt < K)
            System.out.println(0);
    }
}
