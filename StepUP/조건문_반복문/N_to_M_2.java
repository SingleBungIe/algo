package StepUP.조건문_반복문;
/*
 반복문을 활용해 N 부터 M 까지 출력하고
 반복문이 돌 때 마다 카운터를 증가시켜 8의 약수 일 때 한 줄 씩 건너뛴다.
 */

import java.util.Scanner;

public class N_to_M_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int cnt = 0;

        for (int i = N; M >= i; i++) {
            System.out.print(i + " ");
            cnt ++;
            if (cnt % 8 == 0)
                System.out.println();
        }
    }
}
