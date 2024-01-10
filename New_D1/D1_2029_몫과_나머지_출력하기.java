package New_D1;

import java.util.Scanner;

public class D1_2029_몫과_나머지_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int T = 1; T <= t; T++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("#" + T + " " + (a / b) + " " + (a % b));
        }

    }
}
