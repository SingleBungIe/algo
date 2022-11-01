package StepUP.다중반복문_배열;
/*
점화식 도출을 다르게 했으면 쉽게 풀렸을 문제
( 층마다 증가하는 별의 개수) * i + ( 첫줄의 별의 개수 )
 */
import java.util.Scanner;

public class 삼각형_출력_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i; n - 1 > j; j++) { // i 값은 1씩 증가함으로 i와 같은 j값이 ( n - 1 ) 만큼 반복하는 것은 ( -1 * i )씩 감소하여 반복하는 것과 같다.
                System.out.print(" ");
            }
            for (int j = 1; (1 + 2 * i) >= j; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}