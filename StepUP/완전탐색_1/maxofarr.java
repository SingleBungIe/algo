package StepUP.완전탐색_1;
/*
 배열을 쓰지 않고도 구할 수 있는 문제
*/

import java.util.Scanner;

public class maxofarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0; // x좌표
        int y = 0; // y좌표
        int num = 0; // 격자판 수
        int max = 0; // 격자판의 최댓 값

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                num = sc.nextInt();
                if (max < num) {
                    max = num;
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(x + " " + y);
    }
}
