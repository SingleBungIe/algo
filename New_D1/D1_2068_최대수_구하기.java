package New_D1;

import java.util.Scanner;

public class D1_2068_최대수_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int maxNum = 0;
            for (int i = 0; i < 10; i++) {
                int num = sc.nextInt();
                if (maxNum < num) {
                    maxNum = num;
                }
            }
            System.out.println("#" + t + " " + maxNum);
        }
    }
}
