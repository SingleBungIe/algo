package StepUP;

import java.util.Scanner;

public class 제곱근_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; N >= i; i++) {
            if (N <= i * i) {
                System.out.println(i);
                break;
            }
        }
    }
}
