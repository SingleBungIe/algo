package StepUP.조건문_반복문;
/*
 1과 주어진 수를 제외하고 나머지를 0으로 만드는 수는 약수이므로
 반복문을 활용해 2부터 주어진 수까지 1씩 증가시키고 나누어 소수를 판별한다.
 판별이 될 경우 break를 걸어 반복문을 탈출한다.
 */
import java.util.Scanner;

public class 소수_판별 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; n >= i; i++) {
            if (n == i) {
                System.out.println("YES");
                break;
            } else if (n % i == 0) {
                System.out.println("NO");
                break;
            }

        }
    }
}
