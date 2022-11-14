package StepUP.조건문_반복문;
/*
 Math.max() 함수를 활용하면 쉽게 비교 할 수 있다.
 */
import java.util.Scanner;

public class 세_개의_숫자_중_최댓값_찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;

        max = Math.max(a, b);
        max = Math.max(max, c);
        System.out.println(max);
    }
}
