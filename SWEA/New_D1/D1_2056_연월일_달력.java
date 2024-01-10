package SWEA.New_D1;

import java.util.Scanner;

public class D1_2056_연월일_달력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] cal = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int t = sc.nextInt();

        for (int T = 1; T <= t; T++) {
            String st = sc.next();
            String year = st.substring(0, 4);
            String month = st.substring(4, 6);
            String day = st.substring(6, 8);

            if (Integer.valueOf(month) < 1 || Integer.valueOf(month) > 12) {
                System.out.println("#" + T + " " + -1);
                continue;
            }
            if (Integer.valueOf(day) < 1 || cal[Integer.valueOf(month) - 1] < Integer.valueOf(day)) {
                System.out.println("#" + T + " " + -1);
                continue;
            }

            System.out.println("#" + T + " " + year + "/" + month + "/" + day);

        }

    }
}
