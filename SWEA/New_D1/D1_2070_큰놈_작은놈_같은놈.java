package SWEA.New_D1;

import java.util.Scanner;

public class D1_2070_큰놈_작은놈_같은놈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a > b) {
                System.out.println("#" + t + " " + ">");
            } else if (a < b) {
                System.out.println("#" + t + " " + "<");
            } else {
                System.out.println("#" + t + " " + "=");
            }

        }
    }
}
