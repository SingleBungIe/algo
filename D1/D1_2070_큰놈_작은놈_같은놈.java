package D1;

import java.util.Scanner;

public class D1_2070_큰놈_작은놈_같은놈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a < b)
                System.out.println("#" + test_case + " " + "<");
            else if (a == b)
                System.out.println("#" + test_case + " " + "=");
            else
                System.out.println("#" + test_case + " " + ">");
        }

    }

}
