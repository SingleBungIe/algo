package StepUP.조건문_반복문;
/*
 A부터 B까지 반복문을 활용해 반복문 인자 값을 1씩 증가시킨다.
 반복문 인자를 C로 나눈 나머지가 0일 경우 배수이다.
 배수 값을 찾을 경우 카운터를 증가 시키고 출력한다.
 만약, A가 B보다 큰 경우 A와 B를 스왚하여 반목문을 진행한다.
 */

import java.util.Scanner;

public class 배수의_개수_세기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int cnt = 0;
        int temp; // 스왚 변수

        if (A > B) { // 스왚
            temp = B;
            B = A;
            A = temp;
        }
        for (int i = A; B >= i; i++) {
            if (i % C == 0) // 배수 판별
                cnt++; // 카운터 증가
        }

        System.out.println(cnt);
    }
}
