/*
String substring(int index)
String substring(int beginIndex,int endIndex)
 */
package D1;

import java.util.Scanner;

public class D1_2056_연월일_달력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int test_case = 1; test_case <= T; test_case++) {
            String s = sc.next();
            String s_year = s.substring(0, 4);
            String s_month = s.substring(4, 6);
            String s_day = s.substring(6, 8);
            int year = Integer.parseInt(s_year);
            int month = Integer.parseInt(s_month);
            int day = Integer.parseInt(s_day);

            if (year <= 9999 && year >= 1 && month <= 12 && month >= 1 && day <= days[month - 1] && day >= 1) {
                System.out.println("#" + test_case + " " + s_year + "/" + s_month + "/" + s_day);
            } else {
                System.out.println("#" + test_case + " " + -1);
            }
        }

    }
}
