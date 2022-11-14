package StepUP.다중반복문_배열;

import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total = 0;
        for (int i = 0; i <= N; i++) {
            total = i + 1;
            for (int j = 0; j < N; j++) {
                total += j;
                if (j - i < 0) // 핵심 코드
                    continue;
                System.out.print(total + " ");
            }
            System.out.println();
        }
    }
}
