package SWEA.New_D2;

import java.util.Scanner;

public class D2_2007_패턴_마디의_길이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            String a = sc.next();
            for (int i = 1; i <= a.length(); i++) {
                String p = a.substring(0, i);
                String reP = a.substring(i, i + i);
                if (p.equals(reP)) {
                    System.out.println("#" + test_case + " " + p.length());
                    break;
                }
            }


        }
    }
}
