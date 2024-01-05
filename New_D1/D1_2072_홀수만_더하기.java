package New_D1;

import java.util.Scanner;

public class D1_2072_홀수만_더하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                int num = sc.nextInt();
                if (num % 2 == 1) {
                    sum += num;
                }
            }
            System.out.println("#" + t + " " + sum);
        }
    }
}
