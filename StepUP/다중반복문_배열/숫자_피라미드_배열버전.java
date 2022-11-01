package StepUP.다중반복문_배열;
/*
 배열로 저장하여 역순을 손 쉽게 탐색 할 수 있다.
 */
import java.util.Scanner;

public class 숫자_피라미드_배열버전 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // 1 ~ 9까지 숫자를 저장 하는 배열
        int position = S - 1; // num배열의 순서를 스위칭 하기 위한 값. 배열의 순서는 0부터 임으로 -1
        int temp[] = new int[N + N - 1]; // 출력 줄에 출력되는 숫자 들을 저장 하는 배열. 배열의 크기는 N + N - 1


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < -i + N - 1; j++) { // 공백
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) { // num 배열을 스위칭temp에 값 저장
                temp[j] = num[position++]; // num 배열을 +1씩 스위칭 하여 값을 temp배열의 0번째 부터 순서대로 저장한다.
                if (position == 9) // 포지션이 9일 경우
                    position = 0; // 0으로 변경하여 1부터 temp에 저장
            }
            if ((i + 1) % 2 == 0 || i == 0) { // 짝수 일 때
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print(temp[j]);
                }
            } else { // 홀 수 일 때
                for (int j = 2 * i; j >= 0; j--) {
                    System.out.print(temp[j]);
                }
            }

            System.out.println();
        }

    }
}

