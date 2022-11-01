package StepUP.다중반복문_배열;
/*
( 층마다 증가하는 개수) * i + ( 첫줄의 별의 개수 )
 */
import java.util.Scanner;

public class 삼각형_출력_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; n >= i; i++) {
            for (int j = 1; i >= j; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
