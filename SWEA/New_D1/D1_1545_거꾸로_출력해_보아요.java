package SWEA.New_D1;

import java.util.Scanner;

public class D1_1545_거꾸로_출력해_보아요 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}
