package StepUP.조건문_반복문;
/*
 2로 나눈 나머지가 0일 경우 짝수이므로 조건문을 사용해 판별하여 합을 구한다.
 */
import java.util.Scanner;

public class 짝수의_합_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; N >= i; i++) {
            if (i % 2 == 0) // 쩍수 판별
                sum += i;
        }
        System.out.println(sum);
    }
}
