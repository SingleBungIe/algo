package SWEA.New_D1;

import java.util.Scanner;

public class D1_2025_N줄덧셈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result += i;
        }
        System.out.println(result);

    }
}
