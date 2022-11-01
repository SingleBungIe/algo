package StepUP.다중반복문_배열;
/*
( 층마다 증가하는 수 ) * i + ( 첫 줄의 개수 )
 */

import java.util.Scanner;

public class 숫자_피라미드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int currucetFirst = S; // 가장 앞에 수 부터 시작하는 수
        int currucetLast = S; // 가장 마지막 수 부터 시작하는 수

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < -1 * i + N - 1; j++) { // 공백 수, ( 층 마다 늘어나는 수 ) * i + ( 첫 줄의 수 )
                System.out.print(" ");
            }
            if ((i + 1) % 2 == 0 || i == 0) { // 짝수거나 i가 0 일때 정방향대로 증가시켜 출력
                for (int j = 0; j < 2 * i + 1; j++) { // 숫자 수, ( 층 마다 늘어나는 수 ) * i + ( 첫 줄의 수 )
                    System.out.print(currucetFirst); // 앞 숫자 출력
                    currucetFirst++; // 숫자를 증가 시켜준다
                    if (currucetFirst == 10) // 10일 경우
                        currucetFirst = 1; // 1로 변환
                }
            } else if ((i + 1) % 2 == 1) { // 홀수 일때
                for (int j = 0; j < 2 * i + 1; j++) { // currucetLast의 값을 currucetFirst로 변환 시키기 위해 짝수일 때 처럼 currucetFirst 수를 증가시킨다.
                    currucetFirst++; // 출력하지 않고 수만 증가시킨다.
                    if (currucetFirst == 10)
                        currucetFirst = 1;
                }
                currucetLast = currucetFirst; // currucetFirst의 마지막을 currucetLast로 변환
                currucetLast--; // 1이 더 증가 되었음으로 1을 빼준다.
                for (int j = 0; j < 2 * i + 1; j++) {
                    if (currucetLast == 0) // 감소 중 0이 될 경우
                        currucetLast = 9; // 9로 변환
                    System.out.print(currucetLast); // currucetLast의 숫자를 출력
                    currucetLast--; // currucetLast의 숫자를 감소 시킴

                }
            }

            System.out.println();

        }
    }
}